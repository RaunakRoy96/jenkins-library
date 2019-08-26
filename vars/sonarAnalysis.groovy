def call(script, jdkVersion, mavenVar) {
    script.withSonarQubeEnv('sonar') {
        withMaven(jdk: jdkVersion, maven: mavenVar) {
            sh "mvn sonar:sonar -Dsonar.projectKey=key -Dsonar.login=19bb76801ffeda4139739c041ebe2663e44163d0"
        }
    }
    script.timeout(time: 1, unit: 'HOURS') {
        def qualitygate = script.waitForQualityGate()
            if (qualitygate.status != "OK") {
                error "Pipeline aborted due to quality gate coverage failure: ${qualitygate.status}"
            } 
    }
}