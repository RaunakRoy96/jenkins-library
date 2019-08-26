mavenGoal = 'mvn clean install'

def call(script, jdkVar, mavenVar) {
    script.withMaven (
        maven: mavenVar,
        jdk: jdkVar) {
                sh "${mavenGoal}"
    }
}