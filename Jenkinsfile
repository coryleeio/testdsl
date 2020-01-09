pipeline {
  agent {
    docker {
      image 'ubuntu:latest'
      args 'whoami'
    }

  }
  stages {
    stage('') {
      agent {
        docker {
          image 'ubuntu:latest'
        }

      }
      steps {
        sh 'whoami'
      }
    }

  }
}