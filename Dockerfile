FROM eclipse-temurin:11
WORKDIR /springapp
COPY target/*.jar /springapp/springname.jar
COPY . .
ENTRYPOINT ["java","-jar","/springapp/springbname.jar"]
