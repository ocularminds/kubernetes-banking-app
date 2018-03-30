FROM openjdk:alpine
MAINTAINER Festus Jejelowo <festus.jejelowo@ocularminds.com>
ADD target/kubernetes-banking-accounts.jar kubernetes-banking-accounts.jar
ENTRYPOINT ["java", "-jar", "/kubernetes-banking-accounts.jar"]
EXPOSE 2222