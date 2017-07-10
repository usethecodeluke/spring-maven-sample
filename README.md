# docker based spring web app for training

Commands for docker demo:

git clone git@github.com:usethecodeluke/spring-maven-sample.git

cd spring-maven-sample/maven

docker build -f maven.Dockerfile -t demo/maven:alpine-8 .

cd ..

docker run -it --rm -v "$PWD":/app -w /app demo/maven:alpine-8 mvn clean install

docker build -f Dockerfile -t demo/rackerapp .

docker run --rm -p 8080:8080 demo/rackerapp

