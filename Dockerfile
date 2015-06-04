FROM dockerfile/java:oracle-java8

ADD . /home

WORKDIR /home

RUN java -jar target/loggspytter-1.0-SNAPSHOT-jar-with-dependencies.jar
