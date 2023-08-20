pipeline{
    agent{
        docker { image 'node:16-alpine'}
    }
    stages{
        stage('BUILD'){
            agent {
                docker {
                    image 'maven:3-eclipse-temurin-11'}}
            steps{
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('TEST'){
            agent {
                docker {
                    image 'maven:3-eclipse-temurin-11'}}
            steps{
                sh 'mvn test'
            }
        }
        stage('DOCKER-BUILD'){
            steps{
                sh 'docker build -t karthik312/spring-name:latest .'
            }
        }
        stage('PUSH-TO-DOCKER_HUB'){
            steps{
                sh """
                 docker login -u "karthik312" -p "Wwwraw312@"
                 docker image push karthik312/spring-name:latest
                """
            }
        }
    }
}