https://dzone.com/articles/dockerizing-jenkins-2-setup-and-using-it-along-wit?edition=309196&utm_source=Daily%20Digest&utm_medium=email&utm_campaign=dd%202017-07-19



Construir la imagen docker para el contenedor Jenkins
----
``` bash
docker build -t myjenkins . 
```
```bash
docker run -p 8080:8080 -v `pwd`/downloads:/var/jenkins_home/downloads --rm --name myjenkins myjenkins:latest
```
docker run -p 8080:8080  -v `pwd`/downloads:/var/jenkins_home/downloads -v `pwd`/jobs:/var/jenkins_home/jobs/ -v `pwd`/m2deps:/var/jenkins_home/.m2/repository/ --rm --name myjenkins myjenkins:latest