FROM openjdk:alpine
MAINTAINER Festus Jejelowo <festus.jejelowo@ocularminds.com>
ADD target/kubernetes-banking-customers.jar kubernetes-banking-customers.jar
ENTRYPOINT ["java", "-jar", "/kubernetes-banking-customers.jar"]
EXPOSE 3333