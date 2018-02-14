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
  stage('Test'){
	 steps {
	  bat 'mvn test'
	 }
     post {
	  always {
	   junit 'target/surefire-reports/*.xml' 
	  }		 
	 }	 
  }
  stage('Deploy'){
	  steps {
	   bat 'mvn tomcat7:undeploy'
	   bat 'mvn tomcat7:deploy'
	  }
	}  
 }
}
