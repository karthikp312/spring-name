pipeline{
    agent any
    stages{
        stage('BUILD'){
            agent {
                docker { image 'maven:3-eclipse-temurin-11' }
            }
            steps{
                sh 'mvn clean install -DskipTests'
            }
        }
        stage('TEST'){
            agent {
                docker { image 'maven:3-eclipse-temurin-11' }
            }
            steps{
                sh 'mvn test'
            }
        }
        stage('DOCKER-BUILD'){
            steps{
                sh """
                 docker build -t karthik312/spring-name:latest .
                """
            }
        }
        stage('PUSH-TO-DOCKER_HUB'){
            steps{
                call()
            }
        }
    }
}

def call(){
    withCredentials([usernamePassword(
            credentialsId: "docker",
            usernameVariable: "USER",
            passwordVariable: "PASS"
    )]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
        sh "docker push $USER/spring-name:latest"
}