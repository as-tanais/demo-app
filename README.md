# Демо проект: Spring Boot + JWT + Swagger


## Функции

* Регистрации и авторизация пользователя
* Добавлени и создание задачи (ToDo item)

## Технологии

* Spring Boot 3.0
* Spring Security
* JSON Web Tokens (JWT)
* BCrypt
* Maven
* Swagger

## Для старта нужно

* [JDK 21](https://docs.aws.amazon.com/corretto/latest/corretto-21-ug/downloads-list.html)
* Maven 3+

## Чтобы создать и запустить проект, выполните следующие действия:

### Запуск в контейнере Docker

1. Скачать [demo-app-0.0.1-SNAPSHOT.jar](target%2Fdemo-app-0.0.1-SNAPSHOT.jar) 
2. Скачать [Dockerfile](Dockerfile) или создать Dockerfile
3. В Dockerfile. В аргументе ARG JAR_FILE= указать путь до demo-app-0.0.1-SNAPSHOT.jar
```
   FROM amazoncorretto:21
   ARG JAR_FILE=target/demo-app-0.0.1-SNAPSHOT.jar
   WORKDIR /opt/app
   COPY ${JAR_FILE} app.jar
   ENTRYPOINT ["java","-jar","app.jar"]
```
4. Разместить Dockerfile и demo-app-0.0.1-SNAPSHOT.jar в одном и каталоге.
5. Собрать docker образ командой:
```
docker build -t spring-docker-simple:0.0.1 .
```
6. Запустить docker контрейнер
```
docker run -d -p 8080:8080 -t spring-docker-simple:0.0.1 
```

Help по Docker:
1. Сборка образа.
```
   docker build -t <имя_образа>:<тег> <путь_к_Dockerfile> # сборка образа на основе Dockerfile
```
2. Запуск на основе образа.
```
docker run <имя_образа> # запуск контейнера на основе указанного образа
```
### Запуск через сборку проекта
1. Склонировать репозиторий и распоковать проект.
2. Перейдите в каталог проекта.
3. Собрать проект: mvn clean install
4. Запустить проект: mvn spring-boot:run 

### Запуск через JAR 
1. Скачать [demo-app-0.0.1-SNAPSHOT.jar](target%2Fdemo-app-0.0.1-SNAPSHOT.jar)
2. Перейдите в папку скачивани.
3. Запустить командой java -jar demo-app-0.0.1-SNAPSHOT.jar
    - должна быть установлена java и прописана переменная PATH

## Использование / Тестирование

Приложение будет доступно по адресу http://localhost:8080

Описание API доступно http://localhost:8080/swagger-ui/index.html

Для тестов можно использовать [Swagger](docs/swagger/swagger-test.md) или [Postman](docs/postman/postman-test.md)



