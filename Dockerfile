FROM tomcat:9-jdk17
ADD target/astonTask_2_2024-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/astonTask_2_2024-1.0-SNAPSHOT.war
EXPOSE 8085
CMD ["catalina.sh", "run"]
