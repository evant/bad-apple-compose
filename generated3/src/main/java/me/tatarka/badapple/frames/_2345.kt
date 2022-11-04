package me.tatarka.badapple.frames

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val _2345: ImageVector
  get() = Builder(name = "_2345", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
      480.0f, viewportHeight = 360.0f).apply {
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(0.0f, 180.0f)
      lineToRelative(0.0f, 180.0f)
      lineToRelative(116.0f, -0.0f)
      lineToRelative(116.0f, -0.0f)
      lineToRelative(0.0f, -5.8f)
      curveToRelative(0.0f, -3.2f, -0.6f, -18.6f, -1.4f, -34.2f)
      curveToRelative(-0.8f, -15.7f, -2.0f, -47.9f, -2.6f, -71.5f)
      curveToRelative(-0.6f, -23.7f, -1.5f, -54.2f, -2.0f, -67.8f)
      curveToRelative(-1.7f, -43.9f, -0.9f, -134.3f, 1.6f, -171.0f)
      lineToRelative(0.7f, -9.7f)
      lineToRelative(-114.2f, -0.0f)
      lineToRelative(-114.1f, -0.0f)
      lineToRelative(0.0f, 180.0f)
      close()
    }
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(478.6f, 182.2f)
      curveToRelative(-0.8f, 21.5f, -0.5f, 117.1f, 0.4f, 133.8f)
      curveToRelative(0.3f, 6.3f, 0.7f, -25.3f, 0.8f, -70.3f)
      curveToRelative(0.1f, -44.9f, 0.0f, -81.7f, -0.1f, -81.7f)
      curveToRelative(-0.2f, -0.0f, -0.7f, 8.2f, -1.1f, 18.2f)
      close()
    }
  }
  .build()
