FROM openjdk:17-jdk-slim
COPY target/eduvoice-0.0.1.jar /app_eduvoice.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app_eduvoice.jar"]