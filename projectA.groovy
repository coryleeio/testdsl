for(i in 0..10) {
    job("Whoami-${i}") {
        steps {
            shell("whoami")
        }
    }
}