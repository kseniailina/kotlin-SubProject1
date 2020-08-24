package KotlinSubProject1.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.freeDiskSpace
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinSubProject1_Build : BuildType({
    uuid = "15481d42-e0dd-47f9-9902-123842a3d3d6"
    name = "Build"

    vcs {
        root(KotlinSubProject1.vcsRoots.KotlinSubProject1_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster)
    }

    triggers {
        vcs {
        }
    }

    features {
        freeDiskSpace {
            requiredSpace = "5gb"
            failBuild = false
        }
    }
})
