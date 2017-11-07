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



    node {
      // Mark the code checkout 'stage'....
      stage 'Stage Checkout'

      // Checkout code from repository and update any submodules
      // checkout scm

      stage 'Stage Build'

      //branch name from Jenkins environment variables
      echo "My branch is: ${env.BRANCH_NAME}"

      stage 'Stage Print 1'

      echo "Env: ${env}"


      stage 'Stage Print 1'

      echo sh(script: 'env', returnStdout: true)
    }
}
