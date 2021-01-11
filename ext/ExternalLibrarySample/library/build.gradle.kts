plugins {
    id("com.android.library")
}

// build.gradle.kts から rootProject.ext.compileSdkVersion 等にアクセスできないので別ファイルに切り出す
apply(from = "build_android.gradle")

dependencies {
    implementation("androidx.recyclerview:recyclerview:1.1.0")
}
