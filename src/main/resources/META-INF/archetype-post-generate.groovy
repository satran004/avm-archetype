try {
    if(request.isOffline()) {
        println("Offline mode")
        return
    }

    System.setProperty("goals", "io.takari:maven:wrapper")
    def moduleDir = new File(request.getOutputDirectory()+"/"+request.getArtifactId())

    def pomFile = new File(moduleDir, 'pom.xml')
    println "Updating "+pomFile

    def pomContent = pomFile.getText('UTF-8')

    def replace = "x.x.x";

    def version = new URL ("https://raw.githubusercontent.com/satran004/aion4j-maven-plugin/release_ver/release_ver").getText([connectTimeout: 3000, readTimeout: 3000])

    pomContent = pomContent.replace("x.x.x", version.trim())

    // rewrite pom.xml
    pomFile.newWriter().withWriter { w ->
        w << pomContent
    }
} catch(Exception e) {

}