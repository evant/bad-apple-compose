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

public val _5902: ImageVector
  get() = Builder(name = "_5902", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
      480.0f, viewportHeight = 360.0f).apply {
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(0.0f, 180.0f)
      lineToRelative(0.0f, 180.0f)
      lineToRelative(240.0f, -0.0f)
      lineToRelative(240.0f, -0.0f)
      lineToRelative(0.0f, -180.0f)
      lineToRelative(0.0f, -180.0f)
      lineToRelative(-240.0f, -0.0f)
      lineToRelative(-240.0f, -0.0f)
      lineToRelative(0.0f, 180.0f)
      close()
      moveTo(244.4f, 166.5f)
      curveToRelative(4.5f, 4.2f, 3.3f, 11.1f, -2.5f, 14.1f)
      curveToRelative(-4.3f, 2.2f, -8.4f, 0.4f, -9.9f, -4.2f)
      curveToRelative(-3.1f, -9.4f, 5.5f, -16.3f, 12.4f, -9.9f)
      close()
    }
  }
  .build()
