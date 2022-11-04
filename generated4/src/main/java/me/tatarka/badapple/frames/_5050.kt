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

public val _5050: ImageVector
  get() = Builder(name = "_5050", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
      480.0f, viewportHeight = 360.0f).apply {
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(227.5f, 176.8f)
      curveToRelative(-5.1f, 3.3f, -11.4f, 9.4f, -17.1f, 16.9f)
      curveToRelative(-2.1f, 2.8f, -5.4f, 14.1f, -5.4f, 18.7f)
      curveToRelative(0.0f, 6.6f, 3.9f, 13.4f, 11.9f, 20.8f)
      curveToRelative(8.1f, 7.5f, 13.2f, 10.3f, 21.4f, 11.8f)
      curveToRelative(16.8f, 3.2f, 35.8f, -12.8f, 38.6f, -32.4f)
      curveToRelative(1.6f, -11.1f, -2.3f, -20.1f, -12.8f, -29.9f)
      curveToRelative(-7.5f, -6.9f, -14.4f, -9.7f, -23.9f, -9.7f)
      curveToRelative(-6.0f, -0.0f, -7.3f, 0.4f, -12.7f, 3.8f)
      close()
    }
  }
  .build()
