def call (Map params) {
 def branch_name = params.branch_name
def project_name = params.project_name
def base_url = params.base_url
 pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                echo base_url/project_name
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
