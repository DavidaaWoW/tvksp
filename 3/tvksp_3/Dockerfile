FROM eclipse-temurin:17-jdk-alpine as builder
VOLUME /tmp
COPY . ./server
LABEL author="Гегия Давит" group="ИКБО-10-20"
ENV DB_PORT=5432 image_author="Гегия Давит"
RUN sed -i "s|DB_PORT|${DB_PORT}|g" /server/src/main/resources/application.properties
#COPY /build/libs/tvksp_3-0.0.1-SNAPSHOT.jar app.jar
RUN wget -O ./server/src/main/resources/static/gerb.png https://www.mirea.ru/upload/medialibrary/80f/MIREA_Gerb_Colour.png
WORKDIR /server
RUN ./gradlew build

FROM eclipse-temurin:17-jdk-alpine
COPY --from=builder /server/build/libs/tvksp_3-0.0.1-SNAPSHOT.jar app.jar
COPY --from=builder /server /server

ENTRYPOINT ["java","-jar","/app.jar"]
ONBUILD RUN echo "Сборка и запуск произведены. Автор: ${image_author}" >&2