FROM ubuntu:22.04 AS build

RUN apt-get update
RUN apt-get install curl zip unzip maven -y

COPY . .

SHELL ["/bin/bash", "-c"]

RUN curl -s "https://get.sdkman.io" | bash && \
    source "$HOME/.sdkman/bin/sdkman-init.sh" && \
    sdk env install

ENV SDKMAN_CANDIDATES_DIR=/root/.sdkman/candidates
ENV PATH="/root/.sdkman/candidates/java/current/bin:${PATH}"
ENV JAVA_HOME=$SDKMAN_CANDIDATES_DIR/java/current

EXPOSE 8080

ENTRYPOINT ["mvn", "clean", "compile", "exec:java"]
