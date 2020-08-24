package KotlinSubProject1_KotlinSubProjectRename1

import KotlinSubProject1_KotlinSubProjectRename1.buildTypes.*
import KotlinSubProject1_KotlinSubProjectRename1.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    uuid = "693f05f0-1bc4-4a65-b417-5c7ca3d77663"
    id("KotlinSubProject1_KotlinSubProjectRename1")
    parentId("KotlinSubProject1")
    name = "Kotlin SubProject Rename1"

    vcsRoot(KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster)

    buildType(KotlinSubProject1_KotlinSubProjectRename1_Build)
})
