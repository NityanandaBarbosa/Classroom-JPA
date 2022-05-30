<p align="center">
  <a href="https://github.com/NityanandaBarbosa/Classroom-JPA" target="blank"><img src="https://seeklogo.com/images/J/java-logo-7F8B35BAB3-seeklogo.com.png" width="200" alt="Java Logo" /></a>
</p>

## Description

Tutorial to TJW - IFCE Maracanau


## Requirements
- Java installed
- MySQL installed

## Installation

```bash
# paste this in your terminal
$ git clone git@github.com:NityanandaBarbosa/Classroom-JPA.git
```

## How to execute
### 1 - Importing the project

With eclipse pre installed click on "file" and go to the "import" option, choose the "existing maven projects" option, a pop-up will appear on your screen and in the field root directory click on "browser" and choose the project and click "finish".

### 2 - Install/Update dependencies

Click with right click on Clasroom-Jpa folder, move your mouse to "Maven" then click on "Update Project", a pop-up will appear on your screen, then you must select the project and check the option 'Force Update of Snapshots/Releases',after these click 'Ok'.

### 3 - Database

Once again, taking into account that the Mysql database is already installed, you must open the persistence.xml, then change "javax.persistence.jdbc.user" and "javax.persistence.jdbc.password" according your MySQL credentials.

### 4 - Running the code

Basically what you should do now is open src/main/java and look for the package called clients, you'll see a file named as ClientAluno.java then you click with right click, move your mouse to "Run As" then click on "Java application".

## Stay in touch

- Author - Nityananda Barbosa