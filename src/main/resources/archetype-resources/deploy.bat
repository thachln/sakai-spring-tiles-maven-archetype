ECHO OFF

REM Fill your Tomcat Home of Sakai
SET TOMCAT_HOME=
mvn -Dmaven.tomcat.home=%TOMCAT_HOME% clean install sakai:deploy

ECHO Please copy manually these files...
ECHO %USERPROFILE%/.m2/repository/org/projectlombok/lombok/1.16.14/lombok-1.16.14.jar into %TOMCAT_HOME\lib
ECHO Copy "./api/target/...api-x.y.jar" into %SAKAI_TOMCAT%/lib
