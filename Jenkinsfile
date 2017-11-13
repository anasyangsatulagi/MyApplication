node {
    try {
        stage ('Clone') {
        	checkout scm
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
        publishHTML([allowMissing: false, alwaysLinkToLastBuild: false, keepAll: false, reportDir: 'app/build/reports/', reportFiles: 'lint-results-release.html', reportName: 'HTML Report', reportTitles: ''])
        throw err
    }
}
