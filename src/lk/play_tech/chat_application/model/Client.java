package lk.play_tech.chat_application.model;


import javax.imageio.stream.ImageInputStream;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {
    private String name;
    private int port;
    private ServerSocket serverSocket;
    private Socket accept;
    private Socket imgSocket;
    private DataInputStream dataInputStream;
    private DataOutputStream dataOutputStream;
    private InputStream imgInputStream;
    private OutputStream imgOutputStream;
    private String message = "";

    public Client(String name, int port, ServerSocket serverSocket, Socket accept, Socket imgSocket, DataInputStream dataInputStream, DataOutputStream dataOutputStream, InputStream imgInputStream, OutputStream imgOutputStream, String message) {
        this.name = name;
        this.port = port;
        this.serverSocket = serverSocket;
        this.accept = accept;
        this.imgSocket = imgSocket;
        this.dataInputStream = dataInputStream;
        this.dataOutputStream = dataOutputStream;
        this.imgInputStream = imgInputStream;
        this.imgOutputStream = imgOutputStream;
        this.message = message;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public ServerSocket getServerSocket() {
        return serverSocket;
    }

    public void setServerSocket(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    public Socket getAccept() {
        return accept;
    }

    public void setAccept(Socket accept) {
        this.accept = accept;
    }

    public Socket getImgSocket() {
        return imgSocket;
    }

    public void setImgSocket(Socket imgSocket) {
        this.imgSocket = imgSocket;
    }

    public DataInputStream getDataInputStream() {
        return dataInputStream;
    }

    public void setDataInputStream(DataInputStream dataInputStream) {
        this.dataInputStream = dataInputStream;
    }

    public DataOutputStream getDataOutputStream() {
        return dataOutputStream;
    }

    public void setDataOutputStream(DataOutputStream dataOutputStream) {
        this.dataOutputStream = dataOutputStream;
    }

    public InputStream getImgInputStream() {
        return imgInputStream;
    }

    public void setImgInputStream(InputStream imgInputStream) {
        this.imgInputStream = imgInputStream;
    }

    public OutputStream getImgOutputStream() {
        return imgOutputStream;
    }

    public void setImgOutputStream(OutputStream imgOutputStream) {
        this.imgOutputStream = imgOutputStream;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Client(int port) {
        this.port = port;
    }

    public void acceptConnection() throws IOException {
        serverSocket = new ServerSocket(port);
        this.accept = serverSocket.accept();
    }

    public void acceptImgConnection(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        this.imgSocket = serverSocket.accept();
    }

    public void setInputAndOutput() throws IOException {
        this.dataInputStream = new DataInputStream(accept.getInputStream());
        this.dataOutputStream = new DataOutputStream(accept.getOutputStream());
    }

    public void setImageInputAndOutput() throws IOException {
        this.imgInputStream = imgSocket.getInputStream();
        this.imgOutputStream = imgSocket.getOutputStream();
    }

    public void processTextMessage() throws IOException {
        while (!message.equals("exit")) {
            message = "Client 1 : " + dataInputStream.readUTF();
            System.out.println(message);
            String typeName = dataInputStream.getClass().getTypeName();
            System.out.println(typeName);

            if (message.equals("Client 1 : exit")) {
                accept = null;
                return;
            }
//            sendTextMessage(message);
        }
    }

    private void sendTextMessage(String message) throws IOException {
        if (this.accept != null) {
            this.dataOutputStream.writeUTF(message.trim());
            this.dataOutputStream.flush();
        }
    }

//    @Override
//    public void run() {
//        try {
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
