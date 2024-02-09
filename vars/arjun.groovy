def call () {
   pipeline {
      agent any

      stages {
          stage('Hello') {
              steps {
                  echo 'Hello World'
            }
        }
    }
    stages {
          stage('build') {
              steps {
                  echo 'test arjun build'
            }
        }
    }
}

}
