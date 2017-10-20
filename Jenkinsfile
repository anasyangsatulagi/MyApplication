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
        sh 'echo sh(script: \'env|sort\', returnStdout: true)'
      }
    }
  }
}