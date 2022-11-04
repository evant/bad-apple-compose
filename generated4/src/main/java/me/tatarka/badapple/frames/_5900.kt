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

public val _5900: ImageVector
  get() = Builder(name = "_5900", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
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
      moveTo(243.8f, 192.0f)
      curveToRelative(1.6f, 1.5f, 2.2f, 3.3f, 2.2f, 6.1f)
      curveToRelative(0.0f, 5.3f, -1.3f, 7.4f, -5.1f, 8.8f)
      curveToRelative(-4.7f, 1.6f, -8.1f, -0.3f, -9.1f, -5.4f)
      curveToRelative(-1.2f, -5.4f, -0.3f, -8.2f, 3.0f, -9.9f)
      curveToRelative(3.8f, -2.1f, 6.4f, -2.0f, 9.0f, 0.4f)
      close()
    }
  }
  .build()
