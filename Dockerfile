# Dockerfile
FROM tomcat:alpine

ADD target/*.war /usr/local/tomcat/webapps/
