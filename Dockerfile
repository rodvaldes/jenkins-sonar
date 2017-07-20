#Imagen Jenkins Base
FROM jenkins:2.60.1

#get rid of admin password setup
#Elimina la configuración de password al inicio.
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"
#automatically installing all plugins
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt

#Agregar scripts
COPY scripts/groovy/* /usr/share/jenkins/ref/init.groovy.d/