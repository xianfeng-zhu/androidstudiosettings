plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
#if (${INCLUDE_TESTING})
    id("de.mannodermaus.android-junit5")
#end
}

apply(from = "\$rootDir/buildsystem/android_defaults.gradle")

dependencies {
#set ($camel_module = ${StringUtils.removeAndHump(${MODULE_NAME}, "-")})
#set ($first_char = ${camel_module.substring(0,1)})
#set ($lower_first_char = ${first_char.toLowerCase()})
#set ($lower_camel = ${camel_module.substring(1)})

    api(projects.features.${lower_first_char}${lower_camel}.publicApi)
    
    implementation(libs.bundles.dagger)
    kapt(libs.bundles.dagger.processor)
    
#if (${INCLUDE_TESTING})
    testImplementation(libs.bundles.junit5)
    testImplementation(libs.bundles.mockito)
    testImplementation(projects.testing.testUtils)

    testRuntimeOnly(libs.test.junit5.jupiterEngine)
#end
}
