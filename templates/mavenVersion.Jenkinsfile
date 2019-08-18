/**
 * This pipeline will execute a simple Maven build
 */

podTemplate(containers: [
  containerTemplate(name: 'maven', image: 'maven:3.6-jdk-11-slim', ttyEnabled: true, command: 'cat')
  ]) {

  node(POD_LABEL) {
    stage('Build a Maven project') {
      sh 'sleep 10' // On minikube the dns sometimes wont be ready before the clone happens if you dont do this...
      container('maven') {
          sh 'mvn version'
      }
    }
  }
}