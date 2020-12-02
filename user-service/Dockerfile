FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} webnet-user-service.jar
ADD target/webnet-user-service.jar  webnet-user-service.jar
EXPOSE 9002
ENTRYPOINT ["java", "-jar", "/webnet-user-service.jar"]