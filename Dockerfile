FROM maven:3.3-jdk-8

WORKDIR /app
COPY . /app

RUN mvn package

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/target/java-application-1.0-SNAPSHOT-fat.jar"]
