package KotlinSubProject1

import KotlinSubProject1.buildTypes.*
import KotlinSubProject1.vcsRoots.*
import KotlinSubProject1.vcsRoots.KotlinSubProject1_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "2ace5eb8-ac15-4764-8f8b-ae15dd2b6a0a"
    id("KotlinSubProject1")
    parentId("_Root")
    name = "Kotlin SubProject1"

    vcsRoot(KotlinSubProject1_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster)

    buildType(KotlinSubProject1_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_7"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${KotlinSubProject1_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
