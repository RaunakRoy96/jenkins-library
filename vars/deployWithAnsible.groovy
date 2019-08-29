def call(script, host) {
    script.withCredentials([usernamePassword(credentialsId: '47f84f4d-ab54-4743-8250-875b54c8bab9', passwordVariable: 'dockerPassword', usernameVariable: 'dockerUsername')]) {
        //sh "ansible-playbook DeployDocker.yml  -vvvv --extra-vars 'HOST=${host} USERNAME=${env.dockerUsername} PASSWORD=${env.dockerPassword}'"
        script.withCredentials([usernamePassword(credentialsId: '43195002-dcf4-4397-bb78-adf4429b5968', passwordVariable: 'pass', usernameVariable: 'user')]) {
            def user = "devopsinfra"
            def pass = "Applestore12\$6"
            sh "ansible-playbook DeployDocker.yml  -vvvv --extra-vars 'HOST=${host} USERNAME=${env.dockerUsername} PASSWORD=${env.dockerPassword}' -e 'ansible_user=${env.user} ansible_ssh_pass=${env.pass} ansible_sudo_pass=${env.pass}'"
        }
        
    }
}