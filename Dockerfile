FROM openjdk:17-jdk-slim
COPY target/api-0.0.1.jar /app_eduvoice.jar
EXPOSE 3304
ENTRYPOINT ["java", "-jar", "/app_eduvoice.jar"]