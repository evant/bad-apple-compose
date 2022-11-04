plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation("com.google.guava:guava:23.0")
    implementation("com.android.tools:sdk-common:30.3.1")
    implementation("com.android.tools:common:30.3.1")
    implementation("com.squareup:kotlinpoet:1.10.1")
    implementation("org.ogce:xpp3:1.1.6")
}

