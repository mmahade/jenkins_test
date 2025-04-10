pipeline {
    agent any
    tools {
        maven 'maven_3_9_9'
    }
    stages {
        stage('build maven'){
            steps{
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/mmahade/jenkins_test.git']])
                sh 'mvn clean install'
            }
        }
        stage('build docker'){
            steps{
                script{
                    sh 'docker build -t mahade17/jenkins-test .'
                }
            }
        }
        stage('push to docker hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub_pwd', variable: 'docker_pwd')]) {
                    sh 'docker login -u mahade17 -p ${docker_pwd}'
}
                    sh 'docker push mahade17/jenkins-test'
                }
            }
        }
    }
}