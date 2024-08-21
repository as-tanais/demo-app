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

1. Склонировать репозиторий и распоковать проект.
2. Перейдите в каталог проекта.
3. Собрать проект: mvn clean install
4. Запустить проект: mvn spring-boot:run 

## или скачать JAR 
1. Скачать [demo-app-0.0.1-SNAPSHOT.jar](target%2Fdemo-app-0.0.1-SNAPSHOT.jar)
2. Перейдите в папку скачивани.
3. Запустить командой java -jar demo-app-0.0.1-SNAPSHOT.jar
    - должна быть установлена java и прописана переменная PATH


Приложение будет доступно по адресу http://localhost:8080

Описание API доступно http://localhost:8080/swagger-ui/index.html

Для тестов можно использовать [Swagger](docs/swagger/swagger-test.md) или [Postman](docs/postman/postman-test.md)



