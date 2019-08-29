def call(script, host) {
    script.withCredentials([usernamePassword(credentialsId: '47f84f4d-ab54-4743-8250-875b54c8bab9', passwordVariable: 'dockerPassword', usernameVariable: 'dockerUsername')]) {
        //sh "ansible-playbook DeployDocker.yml  -vvvv --extra-vars 'HOST=${host} USERNAME=${env.dockerUsername} PASSWORD=${env.dockerPassword}'"
        def user = "devopsinfra"
        def pass = "Applestore12\$6"
        sh "ansible -m ping all-e 'ansible_user=${user} ansible_ssh_pass=${pass} ansible_sudo_pass=${pass}'"
    }
}