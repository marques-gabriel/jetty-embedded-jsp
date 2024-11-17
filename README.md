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
  <img src="https://github.com/user-attachments/assets/9ac8db84-a743-4310-b2c6-27853d01f6db">
</p>

##
