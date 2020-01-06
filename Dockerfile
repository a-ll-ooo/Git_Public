FROM openjdk:8
EXPOSE 8080
ADD target/coffeeshop-docker.jar coffeeshop-docker
ENTRYPOINT ["java", "-jar","/coffeeshop-docker.jar"]