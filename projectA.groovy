folder('project-a') {
    displayName('Project A')
    description('Folder for project A')
}

for(i in 0..10) {
    job("project-a/Whoami-${i}") {
        steps {
            shell("whoami")
        }
    }
}

folder('project-b') {
    displayName('Project B')
    description('Folder for project B')
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
