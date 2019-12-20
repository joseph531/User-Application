FROM maven:3.6.3-jdk-11 AS Maven
WORKDIR /opt/workspace
RUN git clone --branch develop https://github.com/joseph531/user-service.git
RUN cd /opt/workspace/user-service && mvn clean package

FROM openjdk:latest
WORKDIR /opt/workspace
COPY --from=Maven /opt/workspace/user-service/target/demo-0.0.1-SNAPSHOT.jar /opt/workspace
RUN chmod +x /opt/workspace/demo-0.0.1-SNAPSHOT.jar
RUN ls -ltra
CMD java -jar /opt/workspace/demo-0.0.1-SNAPSHOT.jar

