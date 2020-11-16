package Parent_App2.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Parent_App2_SourceApp2 : GitVcsRoot({
    uuid = "cc311215-b5f7-4246-a4b8-9dd3ff9249cb"
    name = "source app2"
    url = "https://github.com/nguyenxndaidev/spring-petclinic"
    branch = "refs/heads/app2"
    authMethod = password {
        userName = "nguyenxndaidev"
        password = "cksf7235b4f1ffe24d502082cc1e90da91eggPN1fCw28iPbJMJdpGzEA=="
    }
})
