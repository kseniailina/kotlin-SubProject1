package KotlinSubProject11.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinSubProject11_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster : GitVcsRoot({
    uuid = "803dc233-6149-428e-bbfb-cb725df6dfa3"
    name = "https://github.com/kseniailina/kotlin-SubProject1.git#refs/heads/master"
    url = "https://github.com/kseniailina/kotlin-SubProject1.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:29a36eda-5eec-4d23-bba8-3e6e5efa792f"
    }
})
