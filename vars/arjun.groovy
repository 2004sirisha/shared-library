def call (String branch_name) {
 pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                 echo "${branch_name}"
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
