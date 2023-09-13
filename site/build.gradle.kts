import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.link

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.jetbrains.compose)
    alias(libs.plugins.kobweb.application)
}

group = "com.jayasuryat"
version = "1.0-SNAPSHOT"

kotlin {
    configAsKobwebApplication("jayasuryat", includeServer = false)

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(compose.html.core)
                implementation(libs.kobweb.core)
                implementation(libs.kobweb.silk.core)
                implementation(libs.kobweb.silk.icons.fa)
            }
        }
    }
}

kobweb {
    app {
        index {
            head.add {
                link(rel = "preconnect", href = "https://fonts.googleapis.com")
                link(rel = "preconnect", href = "https://fonts.gstatic.com") { attributes["crossorigin"] = "" }
                link(
                    href = "https://fonts.googleapis.com/css2?family=JetBrains+Mono:wght@100;600;800&display=swap",
                    rel = "stylesheet"
                )
                link(href = "https://fonts.googleapis.com/css2?family=Lily+Script+One&display=swap", rel = "stylesheet")
                link(
                    href = "https://fonts.googleapis.com/css2?family=Poppins:wght@100;300;600&display=swap",
                    rel = "stylesheet"
                )
            }
        }
    }
}