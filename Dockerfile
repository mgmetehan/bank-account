FROM openjdk:17-jdk-slim AS build
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} bank-account.jar
ENTRYPOINT ["java", "-jar", "/bank-account.jar"]