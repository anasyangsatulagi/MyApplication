pipeline {
agent any 

stages {
stage('Stage Checkout') {
steps {
checkout scm
}
}
stage('Stage Build') {
steps {
echo "My branch is: ${env.BRANCH_NAME}"
}
}

stage('Stage Print 2') {
steps {
echo sh(script: 'env', returnStdout: true)
}
}
stage('Stage Lint') {
sh "./gradlew lint"
}
}
}
