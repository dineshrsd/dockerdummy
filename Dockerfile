FROM eclipse-temurin:17
COPY target/dockerdummy.jar dockerdummy.jar
CMD ["java","-jar","dockerdummy.jar"]