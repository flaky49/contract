# Lancement de l'application

## Pré-requis

Installation des outils suivants :

* Java jdk 17 ou supérieur [java 21.0.2](https://download.java.net/java/GA/jdk21.0.2/f2283984656d49d69e91c558476027ac/13/GPL/openjdk-21.0.2_windows-x64_bin.zip)
* Maven [Maven 3.9.6](https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.zip)

### Installation Java

1. Extraire l'archive dans votre répertoire d'installation. *(ex. C:\Users\mimi\Documents\opt)*
2. Création de la variable d'environnement pour votre compte **JAVA_HOME** *(ex. JAVA_HOME=C:\Users\mimi\Documents\opt\jdk-21_windows-x64_bin\jdk-21.0.2)*
3. Ajout de la variable d'environnement **%JAVA_HOME%/bin** pour votre compte dans le PATH
4. Ouvrir un terminal et tapez la ligne suivante :
```shell
java -version
```
*Résultat:*
```jshelllanguage
$ java -version
java version "21.0.2" 2024-01-16 LTS
Java(TM) SE Runtime Environment (build 21.0.2+13-LTS-58)
Java HotSpot(TM) 64-Bit Server VM (build 21.0.2+13-LTS-58, mixed mode, sharing)
```

> [!IMPORTANT]
> Si vous n'êtes pas administrateur de votre PC il se peut que la commande retourne la version du java qui est défini dans la PATH de vos variable d'environnement Systeme.
> Ce n'est pas grave pour la suite car maven utilisera spécifiquement la variable d'environnement JAVA_HOME que vous avez défini.

### Installation Maven

1. Extraire l'archive dans votre répertoire d'installation. *(ex. C:\Users\mimi\Documents\opt)*
2. Création de la variable d'environnement pour votre compte **MAVEN_HOME** *(ex. MAVEN_HOME=C:\Users\mimi\Documents\opt\apache-maven-3.8.8-bin\apache-maven-3.8.8)*
3. Ajout de la variable d'environnement **%MAVEN_HOME%/bin** pour votre compte dans le PATH
4. Ouvrir un terminal et tapez la ligne suivante :
```shell
mvn -version
```

*Résultat:*

```jshelllanguage
Apache Maven 3.8.8 (4c87b05d9aedce574290d1acc98575ed5eb6cd39)
Maven home: C:\Users\flaky\Documents\opt\apache-maven-3.8.8-bin\apache-maven-3.8.8
Java version: 21.0.2, vendor: Oracle Corporation, runtime: C:\Users\flaky\Documents\opt\jdk-21_windows-x64_bin\jdk-21.0.2
Default locale: fr_FR, platform encoding: UTF-8
OS name: "windows 11", version: "10.0", arch: "amd64", family: "windows"
```

## Lancement de l'application

1. Récupèrer l'archive [contract.zip](https://github.com/flaky49/contract/archive/refs/heads/master.zip)
2. Extraire l'archive et ce mettre à la racine avec un terminal
3. Lancer la commande suivante 
```jshelllanguage
cd contract-app/
mvn clean javafx:run
```

## Génération de l'installeur

1. Récupèrer l'archive [contract.zip](https://github.com/flaky49/contract/archive/refs/heads/master.zip)
2. Extraire l'archive et ce mettre à la racine avec un terminal
3. Lancer la commande suivante
```jshelllanguage
cd contract-app/
mvn clean javafx:jlink
```
Le zip se trouve dans : *contract-app/target/contract-app.zip*
Il contient tout l'environnement nécessaire pour s'exécuter.
