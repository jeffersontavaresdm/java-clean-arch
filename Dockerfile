FROM openjdk:17-alpine

WORKDIR /app

COPY target/*.jar java.jar

ENTRYPOINT ["java", "-jar", "java.jar"]