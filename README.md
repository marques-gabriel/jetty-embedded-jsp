<p align="center">
  <img src="https://github.com/gabriel0x01/jetty-embedded-jsp/assets/59850744/4111692e-cbc1-4783-8b98-a015ae32a347">
</p>
<p align="center">
Jetty Server Embedded + JSP
</p>

## Tutorial

This is a sample code of application with embedded `Jetty` server supporting `JSP` pages.

## Features

 * Supports Java `21.x`
 * Jetty Servlet Container `12.x`
 * Jakarta EE 10
 * Runs with Docker
 
## Usage

### Compile and Run

```
$ mvn clean compile exec:java
```

> Server runs on port `8080`: `localhost:8080` and `localhost:8080/pages`


### Docker
The repository has a `Dockerfile` as an example to run with `Docker`:

```
$ docker build -t jetty .
$ docker run -p 8080:8080 jetty
```


## Running
<p align="center">
  <img src="https://github.com/gabriel0x01/jetty-embedded-jsp/assets/59850744/cb9138be-d1ab-47b5-ba65-5af9fdc8b95a">
</p>


## Author

| [<img src="https://avatars.githubusercontent.com/u/59850744?v=4" width="155"><br><sub>@gabriel0x01</sub>](https://github.com/gabriel0x01) |
| :---: |
