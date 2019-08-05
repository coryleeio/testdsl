pipelineJob('example') {
    definition {
        cps {
            script(readFileFromWorkspace('multitest.Jenkinsfile'))
        }
    }
}