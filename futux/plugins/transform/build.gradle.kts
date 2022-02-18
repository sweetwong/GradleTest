plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("mytransform") {
            id = "mytransform"
            implementationClass = "TransformPlugin"
        }
    }
}