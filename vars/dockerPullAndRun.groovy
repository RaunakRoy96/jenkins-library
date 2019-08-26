def call(script, imageNameWithUserid, credentials, port1, port2) {
    script.docker.withRegistry('https://registry-1.docker.io/v2/', credentials) {
            script.docker.image(imageNameWithUserid).stop
           script.docker.image(imageNameWithUserid).run("-p ${port1}:${port2}")
       }
}
