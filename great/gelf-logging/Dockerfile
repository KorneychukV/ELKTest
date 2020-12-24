FROM maven:3.6.0-jdk-11-slim

USER root

RUN mkdir /jar

COPY ./target/elk-lab-1.0-SNAPSHOT-runner.jar /jar
COPY ./target/lib /jar/lib

CMD java -jar -Xmx3500m /jar/elk-lab-1.0-SNAPSHOT-runner.jar
