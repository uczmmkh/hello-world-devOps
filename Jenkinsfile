pipeline {
 agent {
   none
 }
 
 stages {
  stage('Build'){
	  steps {
	   bat 'mvn -B -DskipTests clean package'
	  }
	}
 }

}
