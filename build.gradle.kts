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
//    useJUnitPlatform()
    // - FizzBuzz - DONE - Self Run
    // - Parrot - DONE - https://github.com/emilybache/Parrot-Refactoring-Kata/tree/main
    useJUnit()
    // - Beverages - DONE - https://github.com/trikitrok/beverages_pricing_refactoring_kata/tree/master
    // - PromotionText - DONE - https://github.com/nealhu/promotion-text-kata/tree/master
}
// LATER
// https://github.com/emilybache/Lift-Kata
// https://github.com/emilybache/Necklace-Refactoring-Kata
// https://github.com/emilybache/DeliveryController-Refactoring-Kata/tree/main
// https://github.com/emilybache/Racing-Car-Katas
// https://github.com/emilybache/CustomerSync-Refactoring-Kata
// https://github.com/emilybache/Email-Sender-Refactoring-Kata
