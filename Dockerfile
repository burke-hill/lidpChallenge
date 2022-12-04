FROM openjdk:17-jdk-oracle
COPY build/libs/FareCalculator-0.0.1-SNAPSHOT.jar FareApplication.jar
ENTRYPOINT ["java", "-jar", "FareApplication.jar"]

