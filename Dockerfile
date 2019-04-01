# base image -- FROM
FROM openjdk:8
# install required RUN + apt-get
# RUN apt-get update
# RUN apt-get install -y maven
# WORKDIR /code
# COPY ADD
# COPY pom.xml /code/pom.xml
# ADD src /code/src
# RUN ["mvn", "package"]


FROM openjdk:8
ADD /target/springComplete-0.0.1-SNAPSHOT.jar /springComplete-0.0.1-SNAPSHOT.jar
CMD  java -jar /springComplete-0.0.1-SNAPSHOT.jar