FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw install
COPY src ./src
CMD ["./mvnw", "spring-boot:run"]
