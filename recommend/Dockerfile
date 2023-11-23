# builder
FROM amazoncorretto:17.0.8-alpine as builder

WORKDIR /app

COPY . .
RUN ./gradlew build -x test

# runtime image
FROM amazoncorretto:17.0.8-alpine

WORKDIR /app

# spring profile setting
ARG ENVIRONMENT_PROFILE

# timezone setting
ENV TZ=Asia/Seoul
RUN apk add --no-cache tzdata && \
    ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && \
    echo $TZ > /etc/timezone

COPY --from=builder /app/build/libs/*.jar ./app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar", "--Dspring.profiles.active=${ENVIRONMENT_PROFILE}"]
