package me.tatarka.baddapple.generate

import br.com.devsrsouza.svg2compose.Svg2Compose
import br.com.devsrsouza.svg2compose.VectorType
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.*

abstract class GenerateAllFramesTask : DefaultTask() {
    @get:Input
    abstract val packageName: Property<String>

    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty

    @TaskAction
    fun run() {
        AllFramesGenerator.generate(packageName.get(), outputDir.asFile.get())
    }
}

abstract class GenerateFramesTask : DefaultTask() {
    @get:Input
    abstract val packageName: Property<String>

    @get:InputDirectory
    abstract val inputDir: DirectoryProperty

    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty

    @TaskAction
    fun run() {
        Svg2Compose.parse(
            applicationIconPackage = packageName.get(),
            accessorName = "Frames",
            outputSourceDirectory = outputDir.asFile.get(),
            vectorsDirectory = inputDir.asFile.get(),
            type = VectorType.SVG
        )
    }
}

