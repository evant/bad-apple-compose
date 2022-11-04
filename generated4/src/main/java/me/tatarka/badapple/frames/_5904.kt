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

public val _5904: ImageVector
  get() = Builder(name = "_5904", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
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
      moveTo(246.2f, 147.7f)
      curveToRelative(3.9f, 3.7f, 3.8f, 8.4f, -0.1f, 12.4f)
      curveToRelative(-3.6f, 3.5f, -7.5f, 3.8f, -11.4f, 0.6f)
      curveToRelative(-2.2f, -1.7f, -2.8f, -3.1f, -3.0f, -6.4f)
      curveToRelative(-0.3f, -8.5f, 8.4f, -12.5f, 14.5f, -6.6f)
      close()
    }
  }
  .build()
