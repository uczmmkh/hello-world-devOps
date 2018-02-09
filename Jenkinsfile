pipeline {
 agent {
  label "" 
 }
 
 stages {
  stage('Build'){
	  steps {
	   bat 'mvn -B -DskipTests clean package'
	  }
	}
 }

}
