plugins {
    `kotlin-dsl`
    `javiersc-publish-gradle-plugin`
    `accessors-generator`
}

pluginBundle {
    tags =
        listOf(
            "versioning",
            "reckon",
            "git",
        )
}

gradlePlugin {
    plugins {
        named("com.javiersc.gradle.plugins.versioning") {
            id = "com.javiersc.gradle.plugins.versioning"
            displayName = "Versioning"
            description = "A custom plugin for Reckon Plugin and its git versioning"
        }
    }
}

dependencies {
    api(projects.projects.pluginAccessors)
    api(projects.projects.core)

    api(pluginLibs.ajoberstar.reckon.reckonGradle)
}
