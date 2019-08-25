class CheckoutProperties {
	scmClass = 'GitSCM';
	branchName = '*/master';
	scmUrl = 'https://github.com/RaunakRoy96/journaldev-springboot.git';
}

def call() {
	checkout(
        [
            $class: ${CheckoutProperties.scmClass}, 
            branches: [[name: ${CheckoutProperties.branchName}]], 
            doGenerateSubmoduleConfigurations: false, 
            extensions: [], 
            submoduleCfg: [], 
            userRemoteConfigs: [[url: ${CheckoutProperties.scmUrl}]]
        ]
}
