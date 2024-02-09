def call () {
 pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('build') {
            steps {
                echo 'test build'
            }
        }
    }
}
}
