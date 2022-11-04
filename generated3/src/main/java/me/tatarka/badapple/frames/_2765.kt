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

public val _2765: ImageVector
  get() = Builder(name = "_2765", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
      480.0f, viewportHeight = 360.0f).apply {
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(0.0f, 75.5f)
      lineToRelative(0.0f, 16.6f)
      lineToRelative(3.0f, -1.6f)
      curveToRelative(2.8f, -1.5f, 3.0f, -1.9f, 3.0f, -7.8f)
      curveToRelative(0.0f, -3.7f, -0.8f, -8.6f, -2.0f, -12.0f)
      curveToRelative(-1.1f, -3.1f, -2.0f, -6.8f, -2.0f, -8.1f)
      curveToRelative(0.0f, -1.4f, -0.4f, -2.8f, -1.0f, -3.1f)
      curveToRelative(-0.7f, -0.4f, -1.0f, 5.2f, -1.0f, 16.0f)
      close()
    }
  }
  .build()
