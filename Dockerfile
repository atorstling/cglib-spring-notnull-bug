FROM maven:3-jdk-8-alpine
COPY . .
RUN mvn install

