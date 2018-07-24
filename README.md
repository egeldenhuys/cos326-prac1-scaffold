# cos326-prac1-scaffold
Quick start for COS 326 Practical 1

## Development Environment
- java-1.8.0-openjdk.x86_64
- [vscode](https://github.com/Microsoft/vscode)
    - [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
    - [Gradle Language Support](https://marketplace.visualstudio.com/items?itemName=naco-siren.gradle-language)
- [Gradle](https://gradle.org/)

## Building
```
cd prac1
gradle installDb40
gradle fatJar
java -jar build/libs/prac1-all.jar
```

## Configuration
- Modify `mainClassName = 'App'` in `build.gradle` to match your Main Class Name
- Modify `rootProject.name = 'prac1'` in `settings.gradle`