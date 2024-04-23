FROM maven:alpine as builder
RUN apk add --update nodejs npm
RUN apk add busybox-extras
WORKDIR /build
COPY . .

RUN mvn clean
RUN mvn install
RUN mvn package 

FROM openjdk:8-jdk-alpine
WORKDIR /deploy
COPY --from=builder /build/target/*.jar ./app.jar


EXPOSE 8080
CMD ["java","-jar","app.jar"]