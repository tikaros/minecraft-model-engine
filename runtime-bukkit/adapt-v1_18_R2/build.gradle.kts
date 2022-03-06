plugins {
    id("io.papermc.paperweight.userdev") version "1.3.5"
}

repositories {
    maven("https://libraries.minecraft.net/")
}

tasks {
    assemble {
        dependsOn(reobfJar)
    }
}

dependencies {
    implementation(project(":runtime-bukkit:api"))
    implementation("net.kyori:adventure-platform-bukkit:4.0.1")
    paperDevBundle("1.18.2-R0.1-SNAPSHOT")
}