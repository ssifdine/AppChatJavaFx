<<<<<<< HEAD
# Chat-Application
Java Socket Programming

*Technologies*
* Java
* JavaFX
* CSS
* Intellij Idea
* Java Socket Programming

![Screenshot from 2022-09-12 15-41-53](https://user-images.githubusercontent.com/88975401/189648573-df2a78f5-b1bc-467c-94d0-6044564acd18.png)
=======
Application de Chat JavaFX
Une application de messagerie instantanée développée avec JavaFX qui permet à plusieurs utilisateurs de communiquer en temps réel.
🚀 Fonctionnalités

Messages en temps réel entre plusieurs utilisateurs
Partage d'images par sélection de fichiers
Émojis intégrés (sourire, cœur, visage triste)
Interface intuitive avec JavaFX
Support de 4 utilisateurs simultanément (1 serveur + 3 clients)

📋 Prérequis

Java 8 ou supérieur
JavaFX SDK
Un IDE Java (IntelliJ IDEA, Eclipse, etc.)

⚡ Installation Rapide

Cloner le projet
bashgit clone https://github.com/votre-nom/chat-application.git

Ouvrir dans votre IDE

Importer le projet
Configurer JavaFX si nécessaire


Lancer l'application

Démarrer d'abord ServerFormController
Puis lancer les clients via LoginForm01Controller, etc.



🎮 Utilisation
Démarrer le serveur

Exécuter la classe ServerFormController
Le serveur se lance automatiquement

Connecter les clients

Client 1 : Lancer LoginForm01Controller → Saisir un nom → Se connecter
Client 2 : Lancer LoginForm02Controller → Saisir un nom → Se connecter
Client 3 : Lancer LoginForm03Controller → Saisir un nom → Se connecter

Fonctionnalités

Envoyer un message : Taper dans le champ texte et appuyer sur Entrée
Envoyer une image : Cliquer sur le bouton image, choisir un fichier
Utiliser les émojis : Cliquer sur le bouton emoji et sélectionner
Quitter : Cliquer sur le bouton de sortie

📁 Structure du Projet
src/lk/play_tech/chat_application/
├── controller/           # Contrôleurs JavaFX
│   ├── ServerFormController.java
│   ├── Client01FormController.java
│   ├── Client02FormController.java
│   ├── Client03FormController.java
│   └── LoginForm*.java
├── model/
│   └── Client.java       # Modèle de client
├── view/                 # Interfaces FXML
└── assets/              # Images des émojis
⚙️ Configuration
Ports utilisés :

Serveur : 64000
Client 1 : 50000
Client 2 : 60000
Client 3 : 65000









