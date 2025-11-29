# Use a valid OpenJDK 17 slim base image
FROM openjdk:17.0.1-jdk-slim

WORKDIR /app
COPY target/RethinkContact.war app.war
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.war"]
