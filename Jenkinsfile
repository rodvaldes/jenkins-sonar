pipeline {
    agent any
    tools {
        jdk 'jdk8'
        maven 'maven3'
    }
    stages {
        stage('Install') {
            steps {
                sh "mvn -f bamboo-specs-tutorial/pom.xml clean test"
            }
        }
    }
}