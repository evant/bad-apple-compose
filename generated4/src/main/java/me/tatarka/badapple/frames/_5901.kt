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

public val _5901: ImageVector
  get() = Builder(name = "_5901", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
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
      moveTo(244.4f, 179.0f)
      curveToRelative(1.4f, 1.3f, 1.9f, 3.1f, 1.8f, 6.1f)
      curveToRelative(-0.2f, 4.8f, -1.1f, 6.2f, -5.2f, 7.9f)
      curveToRelative(-4.3f, 1.8f, -8.2f, -0.4f, -9.3f, -5.3f)
      curveToRelative(-2.2f, -9.2f, 6.3f, -15.0f, 12.7f, -8.7f)
      close()
    }
  }
  .build()
