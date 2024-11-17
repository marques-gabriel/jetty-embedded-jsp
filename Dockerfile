FROM debian:12.8-slim AS build

RUN apt update && \
    apt install curl zip unzip -y

SHELL ["/bin/bash", "-c"]

COPY . .

RUN curl -s "https://get.sdkman.io" | bash && \
    source "$HOME/.sdkman/bin/sdkman-init.sh" && \
    sdk env install

ENV SDKMAN_CANDIDATES_DIR=/root/.sdkman/candidates
ENV PATH="/root/.sdkman/candidates/java/current/bin:/root/.sdkman/candidates/maven/current/bin:${PATH}"
ENV JAVA_HOME=$SDKMAN_CANDIDATES_DIR/java/current
ENV MAVEN_HOME=$SDKMAN_CANDIDATES_DIR/maven/current

EXPOSE 8080

ENTRYPOINT ["mvn", "clean", "compile", "exec:java"]
