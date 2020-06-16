pipeline {
    agent any 
    stages {
        stage('check for CHANGELOG update') {
            when { expression {env.BRANCH_NAME != 'test' }}
            steps {
                script {
                    sshagent(['jenkins']) {
                        sh 'ls -al'
                        sh 'git status'
                        sh 'git config --global user.name "abiola2"'
                        sh 'git config --global user.email "abiola.oyedemi@africaprudential.com"'
                        sh 'git remote remove origin'
                        sh 'sshpass -p admin002   sudo rm -rf target'
                        sh 'git remote add  origin https://abiola2:oyeniran002@github.com/africa-prudential/radical-lib-model.git'
                        sh 'git fetch --all'
                        sh 'git checkout master'
                        sh 'git pull origin master'
                        sh 'sshpass -p admin002   sudo mvn clean install -U'
                        sh 'git show  --name-only | zip lib_model_patched.zip -@'
                        sh 'mv lib_model_patched.zip /home/jenkins/tomove/'
                        //sh 'chmod a+x jenkins/test.sh'
                        //sh './jenkins/test.sh'
                    }
                }
            }
        }
        stage('push to production'){
            steps{
                sh 'chmod a+x jenkins/test.sh'
                sh './jenkins/test.sh'
            }
        }
    }
}