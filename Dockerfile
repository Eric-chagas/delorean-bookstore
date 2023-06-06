FROM openjdk:17 as environment

WORKDIR /

RUN microdnf install findutils