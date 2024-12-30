# Use an official Maven image as the base image
FROM maven:3.9.4-eclipse-temurin-21-alpine AS build
# Set the working directory in the container
WORKDIR /app
# Copy the pom.xml and the project files to the container
COPY pom.xml .
COPY src ./src
# Build the application using Maven
RUN mvn clean package
# Use an official OpenJDK image as the base image
FROM openjdk:25-jdk-bullseye
# Set the working directory in the container
WORKDIR /app

EXPOSE 443

COPY --from=build /app/target/rohit-0.0.1-SNAPSHOT.jar .

ENTRYPOINT ["java", "-jar", "rohit-0.0.1-SNAPSHOT.jar"]