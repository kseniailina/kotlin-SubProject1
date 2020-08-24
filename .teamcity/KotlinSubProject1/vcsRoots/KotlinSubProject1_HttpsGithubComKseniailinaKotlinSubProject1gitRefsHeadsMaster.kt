package KotlinSubProject1.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinSubProject1_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster : GitVcsRoot({
    uuid = "3e8a0286-91a4-4db3-862b-d3687aadbbed"
    name = "https://github.com/kseniailina/kotlin-SubProject1.git#refs/heads/master"
    url = "https://github.com/kseniailina/kotlin-SubProject1.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:601140fe-628a-481a-bd88-e9127a4de9a7"
    }
})
