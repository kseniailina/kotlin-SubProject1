package KotlinSubProject11

import KotlinSubProject11.vcsRoots.*
import KotlinSubProject11.vcsRoots.KotlinSubProject11_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "1dcbb338-3315-4513-8d25-55c3d679f337"
    id("KotlinSubProject11")
    parentId("_Root")
    name = "Kotlin SubProject1 (1)"

    vcsRoot(KotlinSubProject11_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster)

    features {
        versionedSettings {
            id = "PROJECT_EXT_12"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = "${KotlinSubProject11_HttpsGithubComKseniailinaKotlinSubProject1gitRefsHeadsMaster.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
