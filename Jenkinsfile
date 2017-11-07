pipeline {
    agent any
    parameters {
        string (
            defaultValue: '*',
            description: '',
            name : 'BRANCH_PATTERN')
        booleanParam (
            defaultValue: false,
            description: '',
            name : 'FORCE_FULL_BUILD')
    }

    stages {
        // Mark the code checkout 'stage'....
        stage 'Stage Checkout' {
            steps {
                checkout scm
            }
        }

        // Checkout code from repository and update any submodules

        stage 'Stage Build' {
            steps {
               echo "My branch is: ${env.BRANCH_NAME}"
             }
        }

        stage 'Stage Print 2' {
            steps {
                echo sh(script: 'env', returnStdout: true)
            }
        }

        
        stage 'Stage Lint' {
            sh "./gradlew lint"
        }

    }
}
