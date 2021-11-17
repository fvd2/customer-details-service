FROM openjdk:17-jdk-alpine
ARG JAR_FILE=/target/*.jar
COPY ${JAR_FILE} app.jar
ENV MONGODB_URI=<YOUR_URI>
ENTRYPOINT ["java", "-jar", "/app.jar"]