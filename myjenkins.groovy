pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
    }
}
 node('master') {
        sh'''
        echo 'Hello, world!'
        '''
        logstashSend failBuild: true, maxLines: 1000
 }
