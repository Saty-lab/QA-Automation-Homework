plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(platform("org.junit:junit-bom:5.9.1"))
   // testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.seleniumhq.selenium:selenium-java:4.17.0")
    implementation("org.seleniumhq.selenium:selenium-java:4.17.0")
    implementation("io.github.bonigarcia:webdrivermanager:5.6.3")
    testImplementation("org.testng:testng:7.9.0")
}
tasks.test {
    useTestNG(

    )
}

