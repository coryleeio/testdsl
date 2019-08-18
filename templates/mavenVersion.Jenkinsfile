/**
 * This pipeline will execute a simple Maven build
 */

podTemplate(containers: [
  containerTemplate(name: 'maven', image: 'maven:3.6-jdk-11-slim', ttyEnabled: true, command: 'cat')
  ]) {

  node(POD_LABEL) {
    stage('Wait for JNLP DNS') {
        sh """
              until nslookup google.com
              do
                echo "Try again"
              done
        """
    }
    
    stage('Checkout code') {
      git 'https://github.com/jenkinsci/kubernetes-plugin.git'
    }

    stage('Build a Maven project') {
      container('maven') {
          sh 'mvn -version'
      }
    }
  }
}