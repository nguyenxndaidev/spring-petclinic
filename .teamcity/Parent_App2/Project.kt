package Parent_App2

import Parent_App2.buildTypes.*
import Parent_App2.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    uuid = "0e122824-2e6d-4268-90f8-3a7334b91eb6"
    id("Parent_App2")
    parentId("Parent")
    name = "APP2"

    vcsRoot(Parent_App2_SourceApp2)

    buildType(Parent_App2_Build)
})
