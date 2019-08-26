registry = 'https://registry-1.docker.io/v2/'

def call(script, imageNameWithUserid, credentials, port1, port2) {
    script.docker.withRegistry(registry, credentials) {
           script.docker.image(imageNameWithUserid).run("-p $(port1):$(port2)")
       }
}