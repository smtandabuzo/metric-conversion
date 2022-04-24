FROM openjdk:10-jre-slim

WORKDIR /metric
COPY ./target/metric-0.0.1/SNAPSHOT.jar /metric

EXPOSE 8080

CMD ["java", "-jar", "metric-0.0.1/SNAPSHOT.jar"]