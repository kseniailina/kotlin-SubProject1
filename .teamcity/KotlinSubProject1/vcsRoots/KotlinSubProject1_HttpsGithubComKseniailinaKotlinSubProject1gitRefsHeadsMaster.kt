package KotlinSubProject1.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinSubProject1_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster : GitVcsRoot({
    uuid = "2430c433-55e1-4f57-ba31-bb1e98fa07eb"
    name = "https://github.com/kseniailina/kotlin-SubProject1.git#refs/heads/master"
    url = "https://github.com/kseniailina/kotlin-SubProject1.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:29a36eda-5eec-4d23-bba8-3e6e5efa792f"
    }
})
