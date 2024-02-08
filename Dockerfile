FROM openjdk:17
EXPOSE 8080
ADD target/github-actions.jar github-actions.jar
ENTRYPOINT ["java", "-jar", "/github-actions.jar"]