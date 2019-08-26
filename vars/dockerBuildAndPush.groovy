registry = 'https://registry-1.docker.io/v2/'


def call(script ,imageNameWithUserid ,credentials ) {
     script.docker.withRegistry(registry, credentials) {
            script.docker.build(imageNameWithUserid).push()
       }
}