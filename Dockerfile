FROM openjdk:8
EXPOSE 8080
ADD target/springboot-ci-cd-dimg.jar springboot-ci-cd-dimg.jar
ENTRYPOINT ["java","-jar","/springboot-ci-cd-dimg.jar"] 