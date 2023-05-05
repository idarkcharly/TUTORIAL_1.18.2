# Minecraft 1.18.2 Forge Mod

Aquí podrás consultar el código Java del mod que desarrollamos en los Tutoriales.


## Mappings
En el archivo build.gradle

     mappings channel: 'parchment', version: '2022.11.06-1.18.2'
     
     // Parchment
     
     buildscript {
        repositories {
            maven { url = 'https://maven.minecraftforge.net' }
            maven { url = 'https://maven.parchmentmc.org' }

            mavenCentral()
       }
        dependencies {
           classpath group: 'net.minecraftforge.gradle', name: 'ForgeGradle', version: '5.1.+', changing: true
           classpath 'org.parchmentmc:librarian:1.+'
            } 
        
        plugins {
            id 'eclipse'
            id 'maven-publish'
         }
        apply plugin: 'net.minecraftforge.gradle'
        apply plugin: 'org.parchmentmc.librarian.forgegradle'

## Gradlew Run

Para configurar el proyecto abre el CMD dentro del folder descomprimido y renombrado (MDK) y ejecuta el siguiente comando:


### Si prefieres usar Eclipse IDE 2022-03 (JAVA 17):
```cmd
1) Ejecuta el siguiente comando: gradlew genEclipseRuns
```
si usas Mac/Linux:
```bash
./gradlew genEclipseRuns
```
```
2) Abre Eclipse, Import > Existing Gradle Project > Folder de tu proyecto
```
### Si prefieres usar IntelliJ IDE (JAVA 17):
```cmd
1) Abre IntelliJ e importa el proyecto.
2) Importa el archivo build.gradle
3) Ejecuta el comando: 'gradlew genIntellijRuns' o './genIntellijRuns'
4) Actualiza (Refresh) el proyecto.
```

##### Author

- [@Charly1307](https://www.youtube.com/@charly1307)
# 
[![Suscribe Youtube](https://img.shields.io/youtube/channel/subscribers/UCFNRfmKifPYOF9belzWIjow?color=red&label=Suscr%C3%ADbete&logo=youtube&logoColor=white&style=for-the-badge)](https://www.youtube.com/@charly1307)

[![Status Twitch](https://img.shields.io/twitch/status/idarkcharly?color=red&logo=twitch&logoColor=white&style=for-the-badge)](https://www.twitch.tv/charly1307)

[![Online Discord](https://img.shields.io/discord/955298687591010355?label=Discord&logo=Discord&logoColor=white&style=for-the-badge)](https://discord.gg/2tDNjSxH7N)

[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg?&style=for-the-badge)](https://opensource.org/licenses/)
