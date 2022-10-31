# spring-boot-tomcat-deployment

first we need to add dependencies like spring boot starter tomcat & web
after we need to write <packaging>war</packaging> in pom.xml file
for the first time we are deployment so we need to set path like JAVA_HOME(jdk-17 path ) &CATALINA(tomcat path) in view advance systemproperties

Then mavem clean & install after that war file generated in target folder in spring tool suite(STS) copy the file and paste in webapps folder of the tomcat in local 

