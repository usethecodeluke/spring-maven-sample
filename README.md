# docker based spring web app for training

Commands for docker demo:

Please FORK this repo:
https://github.com/usethecodeluke/spring-maven-sample

If you dont have a github account, clone instead:

`# git clone https://github.com/usethecodeluke/spring-maven-sample.git`

`# cd spring-maven-sample/maven`

`# docker build -f maven.Dockerfile -t demo/maven:alpine-8 .`

`# cd ..`

`# docker run -it --rm -v "$PWD":/app -w /app demo/maven:alpine-8 mvn clean install`

`# docker build -f Dockerfile -t demo/rackerapp .`

`# docker run --rm -p 8080:8080 demo/rackerapp`

Visit: (http://127.0.0.1:8080/springwebapp/racker/add)