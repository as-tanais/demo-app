FROM amazoncorretto:21
#Путь до jar file
ARG JAR_FILE=target/demo-app-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]