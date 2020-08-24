package KotlinSubProject1

import KotlinSubProject1.buildTypes.*
import KotlinSubProject1.vcsRoots.*
import KotlinSubProject1.vcsRoots.KotlinSubProject1_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "40269fcc-8b5e-4f50-b86a-0bbe4f2c3040"
    id("KotlinSubProject1")
    parentId("_Root")
    name = "Kotlin SubProject1"

    vcsRoot(KotlinSubProject1_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster)

    buildType(KotlinSubProject1_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_9"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${KotlinSubProject1_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
