# Use a guaranteed stable image (Java 17 or 21)
FROM eclipse-temurin:17-jdk-focal

# Set the working directory
WORKDIR /app

# Copy the JAR file (Make sure the name is exactly as it appears in /target)
COPY target/TicketReservationSystem-1.0-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]