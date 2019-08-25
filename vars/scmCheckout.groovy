class CheckoutProperties {
	string scmClass = 'GitSCM';
	string branchName = '*/master';
	string scmUrl = 'https://github.com/RaunakRoy96/journaldev-springboot.git';
}

def call(script) {
	script.checkout(
        [
            $class: ${CheckoutProperties.scmClass}, 
            branches: [[name: ${CheckoutProperties.branchName}]], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [], 
            userRemoteConfigs: [[url: ${CheckoutProperties.scmUrl}]]
        ]
}
