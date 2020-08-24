package KotlinSubProject1.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.freeDiskSpace
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object KotlinSubProject1_Build : BuildType({
    uuid = "00a41a43-7305-430b-9183-e2e535830020"
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
