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

public val _4800: ImageVector
  get() = Builder(name = "_4800", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
      480.0f, viewportHeight = 360.0f).apply {
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(50.6f, 5.7f)
      curveToRelative(-0.6f, 6.5f, -2.0f, 31.3f, -3.2f, 56.4f)
      curveToRelative(-0.8f, 19.0f, -0.4f, 21.6f, 3.2f, 22.5f)
      curveToRelative(1.4f, 0.4f, 3.6f, 2.3f, 4.9f, 4.5f)
      curveToRelative(2.1f, 3.3f, 2.6f, 5.9f, 3.8f, 20.6f)
      curveToRelative(1.1f, 13.6f, 1.5f, 16.0f, 2.2f, 12.8f)
      curveToRelative(0.4f, -2.2f, 1.6f, -5.2f, 2.6f, -6.7f)
      curveToRelative(1.5f, -2.0f, 1.9f, -4.4f, 1.9f, -11.3f)
      curveToRelative(0.0f, -6.4f, 0.5f, -9.7f, 2.0f, -12.9f)
      curveToRelative(1.7f, -3.8f, 2.0f, -8.1f, 3.0f, -37.7f)
      curveToRelative(0.6f, -18.4f, 1.0f, -37.9f, 0.8f, -43.4f)
      lineToRelative(-0.3f, -10.0f)
      lineToRelative(-10.2f, -0.3f)
      lineToRelative(-10.1f, -0.3f)
      lineToRelative(-0.6f, 5.8f)
      close()
    }
  }
  .build()
