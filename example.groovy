pipelineJob('example') {
    definition {
        cps {
            script(readFileFromWorkspace('templates/multitest.Jenkinsfile'))
            sandbox()
        }
    }
}