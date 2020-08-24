package KotlinSubProject1_KotlinSubProjectRename1.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object KotlinSubProject1_KotlinSubProjectRename1_HttpsGithubComKseniailinaKotlinSubProjectRename1gitRefsHeadsMaster : GitVcsRoot({
    uuid = "fc45246b-f631-4023-b457-ed7edce7bbc4"
    name = "https://github.com/kseniailina/kotlin-SubProject-rename1.git#refs/heads/master"
    url = "https://github.com/kseniailina/kotlin-SubProject-rename1.git"
    authMethod = password {
        userName = "kseniailina"
        password = "credentialsJSON:601140fe-628a-481a-bd88-e9127a4de9a7"
    }
})
