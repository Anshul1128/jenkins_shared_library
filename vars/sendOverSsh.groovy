 stage('Sending Dockerfile to Ansible server over SSh') {
            sshagent(['ansible_demo']) {
                    sh 'ssh -o StrictHostKeyChecking=no ubuntu 13.126.18.139'
                    sh 'scp /var/lib/jenkins/workspace/K8s/*'
            }
      }
}
