plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.2"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("com.codeborne:selenide:7.7.0")
    testImplementation("org.yaml:snakeyaml:1.33")
}

tasks.test {
    useJUnitPlatform()
}