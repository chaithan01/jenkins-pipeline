pipeline{
    agent any
    stages{
        stage('checkout'){
            steps{
                 checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/chaithan01/jenkins-pipeline.git']]])
            }
           
        }
        stage('mvn-build'){
            steps{
                sh 'mvn clean install -DskipTests'
                sh 'cd target'
            }
        }
        
/*        stage('Building image') {
          steps{
            script {
              dockerImage = docker.build registry + ":$BUILD_NUMBER"
            }
          }
        }
        stage('Deploy Image') {
          steps{
             script {
                docker.withRegistry( '', registryCredential ) {
                dockerImage.push()
              }
            }
          }
        }
        stage('Remove Unused docker image') {
          steps{
            sh "docker rmi $registry:$BUILD_NUMBER"
          }
        }*/
    } 
}
