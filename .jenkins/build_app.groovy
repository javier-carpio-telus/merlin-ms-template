pipeline {
    agent any
    stages {
        stage('Build App') { 
            steps {
                sh 'echo "Job created from seed!"' 
            }
        }
    }
}