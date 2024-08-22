plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.waj.kassa_mobile"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.waj.kassa_mobile"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)


    implementation(libs.spots.dialog)
    implementation("com.android.support:design:28.0.0")


    //retrofit2
    implementation(libs.xadapter.rxjava2)
    implementation(libs.xconverter.scalars)
    implementation(libs.xconverter.gson)
    //rxjava
    implementation(libs.xrxandroid)
    implementation(libs.xrxjava)


}