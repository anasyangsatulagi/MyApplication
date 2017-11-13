node {
    try {
        stage ('Clone') {
        	checkout scm
        }
        stage ('Preparing') {
            sh "bundle install"
        }
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
            sh "./gradlew lintRelease"
      	}
        stage ('Report') {
            sh "bundle exec danger"
        }
    } catch (err) {
        currentBuild.result = 'FAILED'
        throw err
    }
}
