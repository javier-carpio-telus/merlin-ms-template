def buildAppJobName = env.JOB_NAME.replace("/","_")

pipeline {
    agent any
    stages {
        stage('Initial check') {
            steps {
                //Check branch name
                println("Job name: $buildAppJobName") //building-a-multibranch-pipeline-project/development
                sh 'echo "Print script echo:"'
                sh 'echo "Checking if jobs exists"'
                //Check build-app-job exists
                build job: 'JobSeeder', parameters: [
                    [$class: 'StringParameterValue', name: 'NEW_JOB_NAME', value: "${buildAppJobName}_build-app"],
                    [$class: 'StringParameterValue', name: 'REPOSITORY_URL', value: scm.getUserRemoteConfigs()[0].getUrl()],
                    [$class: 'StringParameterValue', name: 'DSL_PATH', value: "jenkins/build_app_dsl"]
                ]
                //Check build-image-job exists
                //Check upload-image-exists
                //Check deploy-image exists
                //Check test-job exists
            }
        }
        
        stage('Build app') {
            steps {
                sh 'echo "Hello world! Build app"'
            }
        }
        
        stage('Build image') {
            steps {
                sh 'echo "Hello world! build image"'
            }
        }
        
        stage('Upload image') {
            steps {
                sh 'echo "Hello world! upload image"'
            }
        }

        
        stage('Deploy image') {
            steps {
                sh 'echo "Hello world! deploy image"'
            }
        }

        stage('Test') {
            steps {
                sh 'echo "Hello world!"'
            }
        }

    }
}
