FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/demo-0.0.1-SNAPSHOT.jar /app/quiz-back-end.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/quiz-back-end.jar"]