def call (Map params) {
 def branch_name = params.branch_name
 pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                 echo branch_name
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
