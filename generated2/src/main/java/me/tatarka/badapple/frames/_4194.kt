package me.tatarka.badapple.frames

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val _4194: ImageVector
  get() = Builder(name = "_4194", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
      480.0f, viewportHeight = 360.0f).apply {
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(17.2f, 182.7f)
      lineToRelative(-17.2f, 0.3f)
      lineToRelative(0.0f, 3.1f)
      lineToRelative(0.0f, 3.0f)
      lineToRelative(232.8f, -0.5f)
      curveToRelative(128.0f, -0.3f, 236.0f, -0.8f, 240.0f, -1.1f)
      curveToRelative(4.8f, -0.5f, 7.2f, -1.1f, 7.2f, -1.9f)
      curveToRelative(0.0f, -1.0f, -26.2f, -1.4f, -126.7f, -1.9f)
      curveToRelative(-201.8f, -1.1f, -317.5f, -1.4f, -336.1f, -1.0f)
      close()
    }
  }
  .build()
