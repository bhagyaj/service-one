from java:8
expose 8080
add /target/service-a-1.0-SNAPSHOT.jar /opt/service-a-1.0-SNAPSHOT.jar
workdir /opt
entrypoint ["java","-jar","service-a-1.0-SNAPSHOT.jar"]

