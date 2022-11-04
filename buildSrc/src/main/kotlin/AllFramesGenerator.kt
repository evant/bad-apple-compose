package me.tatarka.baddapple.generate

import androidx.compose.material.icons.generator.ClassNames
import com.squareup.kotlinpoet.*
import java.io.File

object AllFramesGenerator {

    fun generate(packageName: String, out: File) {
        val fileSpec = FileSpec.builder(packageName, "Frames")
            .addType(TypeSpec.objectBuilder("Frames")
                .apply {
                    val max = 6570
                    val groups = 5
                    val groupSize = max / groups

                    addFunction(FunSpec.builder("get")
                        .addModifiers(KModifier.OPERATOR)
                        .addParameter("i", INT)
                        .returns(ClassNames.ImageVector)
                        .addCode(CodeBlock.builder()
                            .beginControlFlow("return when (i)")
                            .apply {
                                for (group in 0 until groups) {
                                    addStatement("in ${group * groupSize + 1}..${(group + 1) * groupSize} -> get_${group}(i)")
                                }
                                addStatement("else -> throw IllegalArgumentException()")
                            }
                            .endControlFlow()
                            .build())
                        .build())

                    for (group in 0 until groups) {
                        addFunction(
                            FunSpec.builder("get_${group}")
                                .addModifiers(KModifier.PRIVATE)
                                .addParameter("i", INT)
                                .returns(ClassNames.ImageVector)
                                .addCode(
                                    CodeBlock.builder()
                                        .beginControlFlow("return when (i)")
                                        .apply {
                                            for (i in group * groupSize + 1 .. (group + 1) * groupSize) {
                                               addStatement("$i -> _${String.format("%04d", i)}")
                                            }
                                            addStatement("else -> throw IllegalArgumentException()")
                                        }
                                        .endControlFlow()
                                        .build()
                                )
                                .build()
                        )
                    }
                }
                .build())
            .build()

        out.parentFile.mkdirs()
        fileSpec.writeTo(out)
    }
}