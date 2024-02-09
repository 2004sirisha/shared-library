def call(branch_name,branch_name,base_url) { 
    pipeline {
        agent any

        stages {
            stage('Hello') {
                steps {
                    script {
                    echo 'Hello World'
                    echo "${base_url}/${project_name}" // Corrected string interpolation syntax
                }
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
