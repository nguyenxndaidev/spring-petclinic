package Parent_App2.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.maven

object Parent_App2_Build : BuildType({
    uuid = "b8a67d62-1718-4c25-8661-52ff74293c58"
    name = "clean then compile"

    vcs {
        root(Parent_App2.vcsRoots.Parent_App2_SourceApp2)
    }

    steps {
        maven {
            goals = "clean compile"
            runnerArgs = "-Dmaven.test.failure.ignore=true"
        }
    }
})
