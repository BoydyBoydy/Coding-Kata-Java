plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
    testImplementation("junit:junit:4.13.1")
}

tasks.test {
    useJUnitPlatform()
    // - FizzBuzz - DONE - Self Run
    // - Parrot - WIP - https://github.com/emilybache/Parrot-Refactoring-Kata/tree/main
//    useJUnit()
    // - Beverages - DONE - https://github.com/trikitrok/beverages_pricing_refactoring_kata/tree/master
    // - PromotionText - https://github.com/nealhu/promotion-text-kata/tree/master
}

