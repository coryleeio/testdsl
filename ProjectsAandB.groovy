
for(i in 0..10) {
    job("project-a/Whoami-${i}") {
        steps {
            shell("whoami")
        }
    }
}

for(i in 0..10) {
	pipelineJob("project-b/whoami${i}") {
	    definition {
	        cps {
	            script(readFileFromWorkspace('templates/mavenVersion.Jenkinsfile'))
	            sandbox()
	        }
	    }
	}
}


