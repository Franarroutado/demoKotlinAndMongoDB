# We select the base image from. Locally available or from https://hub.docker.com/
FROM alpine:3.11

RUN apk add openjdk11

# We define the user we will use in this instance to prevent using root that even in a container, can be a security risk.
ENV APPLICATION_USER ktor

# Then we add the user, create the /app folder and give permissions to our user.
RUN adduser -D -g '' $APPLICATION_USER
RUN mkdir /app
RUN chown -R $APPLICATION_USER /app

# Marks this container to use the specified $APPLICATION_USER
USER $APPLICATION_USER

# We copy the FAT Jar we built into the /app folder and sets that folder as the working directory.
COPY ./build/libs/funWithSpringboot-0.0.1-SNAPSHOT.jar /app/myapp.jar
WORKDIR /app

# We launch java to execute the jar, with good defauls intended for containers.
CMD ["java", "-jar", "myapp.jar"]