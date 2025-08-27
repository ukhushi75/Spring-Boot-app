FROM eclipse-temurin:21-jdk
EXPOSE 8080
ADD target/my-spring-boot-app.jar my-spring-boot-app.jar
ENTRYPOINT ["java", "-jar", "/my-spring-boot-app.jar"]
# before commiting we need to add the secrets
# we provide the username and password in the maven file
# we can add this in the github repo itself