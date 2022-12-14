buildscript {
    dependencies {
        classpath(AndroidDependencies.androidGradlePlugin)
        classpath(AndroidDependencies.firebaseCrashlyticsPlugin)
        classpath(AndroidDependencies.firebasePerfPlugin)
        classpath(AndroidDependencies.googleServices)
    }
}

plugins {
    id("com.android.application") version "7.3.0" apply false
    id("com.android.library") version "7.3.0" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.0" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}