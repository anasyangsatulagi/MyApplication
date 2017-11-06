
node {
    stage ('Build') {
        sh "echo 'shell scripts to build project...'"
    }
    stage ('Tests') {
	 parallel 'static': {
		 sh "echo 'shell scripts to run static tests...'"
	        },
	        'unit': {
	            sh "echo 'shell scripts to run unit tests...'"
	        },
	        'integration': {
	            sh "echo 'shell scripts to run integration tests...'"
	        }
        }
      	stage ('Deploy') {
            echo sh(returnStdout: true, script: 'env')
      	}
}
