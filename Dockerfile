FROM maven:3.8.7-openjdk-18-slim AS build

RUN mkdir /opt/checkpoint2

COPY . /opt/checkpoint2

WORKDIR /opt/checkpoint2

RUN mvn clean package

FROM eclipse-temurin:18-jre-alpine

RUN mkdir /opt/checkpoint2

COPY --from=build  /opt/checkpoint2/target/app.jar /opt/checkpoint2/app.jar

WORKDIR /opt/checkpoint2

ENV PROFILE=dev

EXPOSE 8080

ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILE}", "-jar", "app.jar"]