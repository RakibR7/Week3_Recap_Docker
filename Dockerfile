FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY target/Week3_Recap_Docker-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "Week3_Recap_Docker-0.0.1-SNAPSHOT.jar"]

