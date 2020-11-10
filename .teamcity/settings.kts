import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

/*
The settings script is an entry point for defining a TeamCity
project hierarchy. The script should contain a single call to the
project() function with a Project instance or an init function as
an argument.

VcsRoots, BuildTypes, Templates, and subprojects can be
registered inside the project using the vcsRoot(), buildType(),
template(), and subProject() methods respectively.

To debug settings scripts in command-line, run the

    mvnDebug org.jetbrains.teamcity:teamcity-configs-maven-plugin:generate

command and attach your debugger to the port 8000.

To debug in IntelliJ Idea, open the 'Maven Projects' tool window (View
-> Tool Windows -> Maven Projects), find the generate task node
(Plugins -> teamcity-configs -> teamcity-configs:generate), the
'Debug' option is available in the context menu for the task.
*/

version = "2020.1"

project {

    vcsRoot(HttpsGithubComNguyenxndaidevTeamcitydemoRefsHeadsMain)

    buildType(TeamcitydemoBuild)
    buildType(SpringPetclinicBuild)
}

object SpringPetclinicBuild : BuildType({
    name = "spring-petclinic-build"

    vcs {
        root(DslContext.settingsRoot)
    }

    triggers {
        vcs {
        }
    }
})

object TeamcitydemoBuild : BuildType({
    name = "TeamcitydemoBuild"

    vcs {
        root(HttpsGithubComNguyenxndaidevTeamcitydemoRefsHeadsMain)
    }

    triggers {
        vcs {
        }
    }
})

object HttpsGithubComNguyenxndaidevTeamcitydemoRefsHeadsMain : GitVcsRoot({
    name = "https://github.com/nguyenxndaidev/teamcitydemo#refs/heads/main"
    url = "https://github.com/nguyenxndaidev/teamcitydemo"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "nguyenxndaidev"
        password = "credentialsJSON:2e8c82f4-cbae-4404-a5db-1d5b6aff5bf9"
    }
})
