pipeline {
  agent any
  stages {
    stage('Preparing') {
      agent any
      steps {
        echo 'Hello World'
      }
    }
    stage('') {
      steps {
        echo sh(script: 'env|sort', returnStdout: true)
      }
    }
  }
}
