plugins {
    id("com.android.library")
    kotlin("android")
}

apply(from = "\$rootDir/buildsystem/android_defaults.gradle")

dependencies {
    implementation(projects.core.navigation)
}
