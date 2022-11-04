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

public val _4200: ImageVector
  get() = Builder(name = "_4200", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
      480.0f, viewportHeight = 360.0f).apply {
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(195.8f, 185.0f)
      curveToRelative(-107.0f, 0.3f, -194.9f, 0.8f, -195.3f, 1.1f)
      curveToRelative(-1.6f, 1.7f, 80.4f, 2.1f, 271.0f, 1.5f)
      curveToRelative(114.4f, -0.4f, 208.2f, -0.9f, 208.4f, -1.2f)
      curveToRelative(0.2f, -0.2f, 0.2f, -0.6f, 0.0f, -0.8f)
      curveToRelative(-0.9f, -0.9f, -93.8f, -1.1f, -284.1f, -0.6f)
      close()
    }
  }
  .build()
