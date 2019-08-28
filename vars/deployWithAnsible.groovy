def call(script, host) {
    script.withCredentials([usernamePassword(credentialsId: '47f84f4d-ab54-4743-8250-875b54c8bab9', passwordVariable: 'dockerPassword', usernameVariable: 'dockerUsername')]) {
        sh "ansible-playbook DeployDocker.yml --key-file '.ssh/id_rsa.pub' -vvvv --extra-vars 'HOST=${host} USERNAME=${env.dockerUsername} PASSWORD=${env.dockerPassword}'"
    }
}