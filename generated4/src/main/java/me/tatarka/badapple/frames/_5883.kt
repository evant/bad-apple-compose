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

public val _5883: ImageVector
  get() = Builder(name = "_5883", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
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
      lineToRelative(-132.9f, -0.0f)
      lineToRelative(-133.0f, -0.0f)
      lineToRelative(2.5f, 9.2f)
      curveToRelative(7.6f, 28.4f, 15.1f, 50.1f, 22.7f, 65.3f)
      curveToRelative(4.2f, 8.4f, 5.1f, 11.1f, 4.1f, 12.6f)
      curveToRelative(-0.4f, 0.7f, -2.4f, -0.6f, -5.3f, -3.7f)
      curveToRelative(-2.6f, -2.7f, -8.1f, -7.1f, -12.3f, -9.7f)
      curveToRelative(-14.7f, -9.3f, -37.7f, -33.8f, -56.9f, -60.8f)
      lineToRelative(-9.1f, -12.9f)
      lineToRelative(-79.9f, -0.0f)
      lineToRelative(-79.9f, -0.0f)
      lineToRelative(0.0f, 180.0f)
      close()
      moveTo(243.5f, 171.6f)
      curveToRelative(2.1f, 2.2f, 1.5f, 6.3f, -1.2f, 8.1f)
      curveToRelative(-1.9f, 1.3f, -2.3f, 1.2f, -4.2f, -0.8f)
      curveToRelative(-2.6f, -2.8f, -2.6f, -4.0f, -0.1f, -6.7f)
      curveToRelative(2.5f, -2.6f, 3.3f, -2.7f, 5.5f, -0.6f)
      close()
    }
  }
  .build()
