# Use a valid OpenJDK 17 slim base image
#FROM openjdk:17.0.1-jdk-slim
#WORKDIR /app
#COPY target/RethinkContact.war app.war
#EXPOSE 8081
#ENTRYPOINT ["java", "-jar", "app.war"]

# Use a valid OpenJDK 17 lightweight base image
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Copy the WAR file to the container
COPY target/RethinkContact.war app.war

# Expose port 8080 (Spring Boot default)
EXPOSE 8081

# Start the application using the dynamic Render port
CMD ["sh", "-c", "java -jar app.war --server.port=$PORT"]

