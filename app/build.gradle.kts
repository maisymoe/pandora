plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "moe.maisy.pandora"
    compileSdk = 34

    defaultConfig {
        applicationId = "moe.maisy.pandora"
        minSdk = 30
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
        vectorDrawables {
            useSupportLibrary = true
        }

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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // General Compose dependencies
    implementation("androidx.activity:activity-compose:1.8.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.4")

    // Compose for Wear OS Dependencies
    implementation("androidx.wear.compose:compose-material:1.2.1")

    // Navigation
    implementation("androidx.wear.compose:compose-navigation:1.2.1")

    // Misc
    implementation("androidx.wear.compose:compose-foundation:1.2.1")
    implementation("androidx.wear.compose:compose-ui-tooling:1.2.1")
    implementation("com.google.android.horologist:horologist-compose-layout:0.5.10")

    // Shizuku
    implementation("dev.rikka.shizuku:api:13.1.5")
    implementation("dev.rikka.shizuku:provider:13.1.5")
}