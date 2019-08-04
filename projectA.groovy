for(i in 0..10) {
    job("DSL-Tutorial-1-Test-${i}") {
        steps {
            shell("whoami")
        }
    }
}