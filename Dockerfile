FROM java:8
ADD target/garnet.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]