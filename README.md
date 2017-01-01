# maven-samples
all my samples to learn working with maven, dependency management, transitive dependencies, parent pom

maven-tomcat-sample1
    http://tomcat.apache.org/maven-plugin-2.2/

    ￼vi apache-maven-3.2.3/conf/settings.xml
       <server>
            <id>TomcatServer</id>
            <username>tomcat</username>
            <password>s3cret</password>
       </server>


    pom.xml
      <build>
        <finalName>maven-tomcat-sample1</finalName>
        <plugins>
          <plugin>
            <groupId>org.apache.tomcat.maven</groupId>
            <artifactId>tomcat7-maven-plugin</artifactId>
            <version>2.2</version>
            <configuration>
              <url>http://localhost:8080/manager/text</url>
              <server>TomcatServer</server>
              <path>/mvn</path>
            </configuration>
          </plugin>
        </plugins>
    </build>
  
  
  
  
