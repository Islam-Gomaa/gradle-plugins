import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

val KotlinSourceSet.defaultLanguageSettings: Unit
    get() {
        with(languageSettings) {
            optIn("kotlin.ExperimentalStdlibApi")
            optIn("kotlin.RequiresOptIn")
            optIn("kotlin.time.ExperimentalTime")
            optIn("kotlinx.coroutines.ExperimentalCoroutinesApi")
            optIn("kotlinx.coroutines.FlowPreview")
            optIn("kotlinx.coroutines.ObsoleteCoroutinesApi")
            optIn("kotlinx.serialization.ExperimentalSerializationApi")
            optIn("kotlinx.serialization.InternalSerializationApi")
            optIn("io.ktor.util.KtorExperimentalAPI")
        }
    }
