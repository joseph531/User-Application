# Alpine Linux with OpenJDK JRE
FROM maven:3.6.3-jdk-11

RUN apt update -y
RUN apt install vim -y 

WORKDIR /opt/workspace
COPY . /opt/workspace

RUN mvn clean package

RUN chmod +x /opt/workspace/target/demo-0.0.1-SNAPSHOT.jar
RUN ls -ltra
CMD java -jar /opt/workspace/target/demo-0.0.1-SNAPSHOT.jar

