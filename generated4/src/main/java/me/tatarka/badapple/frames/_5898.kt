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

public val _5898: ImageVector
  get() = Builder(name = "_5898", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
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
      moveTo(244.5f, 223.4f)
      curveToRelative(2.2f, 1.6f, 2.3f, 8.8f, 0.1f, 12.2f)
      curveToRelative(-1.8f, 2.7f, -6.0f, 3.8f, -8.7f, 2.4f)
      curveToRelative(-4.1f, -2.2f, -5.2f, -10.7f, -1.9f, -14.0f)
      curveToRelative(2.3f, -2.3f, 7.7f, -2.7f, 10.5f, -0.6f)
      close()
    }
  }
  .build()
