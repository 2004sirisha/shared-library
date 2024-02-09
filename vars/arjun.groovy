def call(String branch_name, String project_name, String base_url) {
    pipeline {
        agent any

        stages {
            stage('Hello') {
                steps {
                    script {
                        echo 'Hello World'
                        echo "${base_url}/${project_name}/${branch_name}" // Corrected string interpolation synt
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
