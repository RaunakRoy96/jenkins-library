def call(script ,imageNameWithUserid ,credentials ) {
     script.docker.withRegistry('https://registry-1.docker.io/v2/', credentials) {
            script.docker.build(imageNameWithUserid).push()
       }
}