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