/**
 * This pipeline will execute a simple Maven build
 */

podTemplate(containers: [
  containerTemplate(name: 'maven', image: 'maven:3.6-jdk-11-slim', ttyEnabled: true, command: 'cat')
  ]) {

  node() 
  {
        git 'https://github.com/jenkinsci/kubernetes-plugin.git'
  }

  node(POD_LABEL) {
    stage('Build a Maven project') {
      container('maven') {
          sh 'mvn -B clean package'
      }
      archiveArtifacts '*'
    }
  }
}