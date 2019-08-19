pipelineJob('example') {
    definition {
        cps {
            script(readFileFromWorkspace('jobs/templates/multitest.Jenkinsfile'))
            sandbox()
        }
    }
}