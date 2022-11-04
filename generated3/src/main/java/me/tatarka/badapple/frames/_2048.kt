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

public val _2048: ImageVector
  get() = Builder(name = "_2048", defaultWidth = 480.0.dp, defaultHeight = 360.0.dp, viewportWidth =
      480.0f, viewportHeight = 360.0f).apply {
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(0.0f, 180.0f)
      lineToRelative(0.0f, 180.0f)
      lineToRelative(33.4f, -0.0f)
      lineToRelative(33.4f, -0.0f)
      lineToRelative(1.5f, -2.3f)
      curveToRelative(0.8f, -1.2f, 2.0f, -4.9f, 2.7f, -8.2f)
      curveToRelative(1.1f, -5.1f, 1.0f, -6.0f, -0.3f, -7.0f)
      curveToRelative(-0.9f, -0.6f, -2.5f, -3.4f, -3.6f, -6.3f)
      curveToRelative(-1.9f, -4.7f, -1.9f, -5.4f, -0.6f, -8.7f)
      curveToRelative(1.0f, -2.2f, 1.3f, -4.9f, 0.9f, -7.3f)
      curveToRelative(-0.5f, -3.0f, -0.2f, -4.1f, 1.5f, -5.6f)
      curveToRelative(1.3f, -1.2f, 1.8f, -2.3f, 1.2f, -3.0f)
      curveToRelative(-0.4f, -0.6f, -1.3f, -2.5f, -1.9f, -4.1f)
      curveToRelative(-0.5f, -1.7f, -1.3f, -3.7f, -1.7f, -4.6f)
      curveToRelative(-0.4f, -1.1f, 0.0f, -1.8f, 1.4f, -2.2f)
      curveToRelative(1.7f, -0.4f, 2.1f, -1.3f, 2.1f, -4.9f)
      curveToRelative(0.0f, -5.2f, -0.7f, -6.3f, -5.1f, -8.7f)
      curveToRelative(-4.3f, -2.3f, -8.7f, -7.7f, -9.5f, -11.8f)
      curveToRelative(-0.6f, -2.9f, -0.3f, -3.5f, 2.5f, -5.0f)
      curveToRelative(5.6f, -3.2f, 6.3f, -6.3f, 9.6f, -38.3f)
      curveToRelative(3.7f, -36.4f, 4.4f, -43.5f, 3.9f, -43.9f)
      curveToRelative(-0.2f, -0.3f, -0.9f, -0.0f, -1.6f, 0.7f)
      curveToRelative(-0.8f, 0.8f, -1.9f, 0.7f, -4.2f, -0.5f)
      curveToRelative(-4.1f, -2.1f, -4.1f, -2.0f, -2.7f, -3.7f)
      curveToRelative(1.7f, -2.1f, 6.2f, -20.8f, 5.5f, -23.1f)
      curveToRelative(-0.4f, -1.1f, -2.6f, -4.1f, -4.9f, -6.6f)
      curveToRelative(-5.2f, -5.6f, -6.5f, -8.1f, -9.8f, -18.5f)
      curveToRelative(-5.0f, -15.9f, -4.6f, -31.1f, 1.3f, -43.1f)
      curveToRelative(4.2f, -8.4f, 10.3f, -14.3f, 25.0f, -24.1f)
      curveToRelative(15.1f, -10.0f, 26.1f, -15.6f, 35.5f, -17.8f)
      curveToRelative(3.9f, -0.9f, 11.0f, -2.8f, 16.0f, -4.1f)
      curveToRelative(9.8f, -2.6f, 21.4f, -4.4f, 24.9f, -3.7f)
      curveToRelative(2.2f, 0.4f, 2.2f, 0.3f, 1.8f, -11.6f)
      curveToRelative(-0.3f, -6.6f, -0.1f, -12.0f, 0.3f, -12.0f)
      curveToRelative(1.2f, -0.0f, 4.1f, 3.9f, 13.2f, 17.4f)
      curveToRelative(4.7f, 7.2f, 11.7f, 16.3f, 15.4f, 20.3f)
      curveToRelative(7.5f, 8.1f, 12.9f, 16.9f, 15.9f, 26.0f)
      curveToRelative(2.7f, 8.3f, 6.7f, 15.1f, 9.9f, 16.8f)
      curveToRelative(1.6f, 0.8f, 4.9f, 1.9f, 7.5f, 2.6f)
      curveToRelative(4.1f, 1.0f, 5.6f, 0.9f, 10.8f, -0.7f)
      lineToRelative(6.1f, -1.8f)
      lineToRelative(3.6f, 4.2f)
      curveToRelative(2.0f, 2.3f, 4.2f, 4.2f, 4.9f, 4.2f)
      curveToRelative(1.7f, -0.0f, 1.5f, 2.8f, -0.7f, 9.1f)
      curveToRelative(-2.7f, 8.0f, -5.2f, 12.7f, -7.0f, 13.4f)
      curveToRelative(-0.8f, 0.3f, -2.7f, -0.3f, -4.3f, -1.5f)
      curveToRelative(-3.1f, -2.3f, -5.8f, -2.6f, -5.8f, -0.7f)
      curveToRelative(0.0f, 0.8f, 0.6f, 3.5f, 1.4f, 6.0f)
      curveToRelative(1.1f, 3.7f, 1.1f, 4.7f, 0.1f, 4.7f)
      curveToRelative(-0.7f, -0.0f, -1.5f, 1.8f, -1.8f, 4.2f)
      curveToRelative(-0.3f, 2.3f, -1.2f, 4.7f, -1.9f, 5.3f)
      curveToRelative(-0.8f, 0.5f, -1.7f, 1.8f, -2.1f, 2.8f)
      curveToRelative(-0.4f, 1.0f, -1.1f, 1.5f, -1.7f, 1.2f)
      curveToRelative(-0.6f, -0.4f, -1.0f, 0.7f, -1.0f, 2.7f)
      curveToRelative(0.0f, 2.9f, -1.9f, 7.9f, -2.0f, 5.3f)
      curveToRelative(0.0f, -0.6f, -0.7f, -0.1f, -1.5f, 0.9f)
      curveToRelative(-1.1f, 1.4f, -1.5f, 1.6f, -1.5f, 0.5f)
      curveToRelative(-0.1f, -4.4f, -4.3f, -4.7f, -5.5f, -0.2f)
      curveToRelative(-0.3f, 1.3f, -1.4f, 3.4f, -2.5f, 4.5f)
      curveToRelative(-1.5f, 1.7f, -1.8f, 3.0f, -1.3f, 7.2f)
      curveToRelative(0.2f, 2.8f, 0.9f, 6.6f, 1.5f, 8.4f)
      curveToRelative(0.7f, 2.3f, 0.6f, 3.7f, -0.1f, 4.6f)
      curveToRelative(-0.9f, 1.0f, -0.6f, 2.6f, 0.9f, 6.1f)
      curveToRelative(1.1f, 2.6f, 1.8f, 5.0f, 1.5f, 5.3f)
      curveToRelative(-0.3f, 0.3f, -1.8f, -0.7f, -3.4f, -2.2f)
      lineToRelative(-2.8f, -2.7f)
      lineToRelative(-2.3f, 5.8f)
      curveToRelative(-3.8f, 9.6f, -7.9f, 16.2f, -11.2f, 17.9f)
      curveToRelative(-2.5f, 1.3f, -4.6f, 1.4f, -11.2f, 0.8f)
      curveToRelative(-4.4f, -0.5f, -8.5f, -0.8f, -9.0f, -0.9f)
      curveToRelative(-0.5f, -0.0f, -1.1f, 1.7f, -1.3f, 3.8f)
      curveToRelative(-0.4f, 4.4f, 0.6f, 5.1f, 10.7f, 6.2f)
      curveToRelative(3.6f, 0.4f, 12.6f, 2.2f, 20.0f, 4.0f)
      curveToRelative(7.4f, 1.9f, 15.0f, 3.6f, 16.8f, 4.0f)
      curveToRelative(2.2f, 0.5f, 3.7f, 1.6f, 4.8f, 3.6f)
      curveToRelative(1.8f, 3.5f, 1.2f, 4.9f, -2.2f, 4.9f)
      curveToRelative(-3.0f, -0.0f, -3.0f, 0.4f, 0.0f, 4.3f)
      curveToRelative(1.3f, 1.8f, 3.6f, 5.6f, 5.0f, 8.5f)
      curveToRelative(2.6f, 5.1f, 2.8f, 5.3f, 5.9f, 4.7f)
      curveToRelative(1.8f, -0.4f, 5.9f, -1.8f, 9.2f, -3.1f)
      curveToRelative(11.4f, -4.7f, 24.3f, -6.6f, 44.0f, -6.8f)
      curveToRelative(16.6f, -0.1f, 18.9f, 0.1f, 30.0f, 2.8f)
      curveToRelative(36.0f, 8.6f, 68.7f, 30.7f, 90.5f, 60.9f)
      curveToRelative(7.1f, 9.9f, 19.2f, 31.5f, 18.8f, 33.6f)
      curveToRelative(-0.2f, 0.8f, -5.2f, 3.3f, -11.2f, 5.7f)
      curveToRelative(-6.0f, 2.4f, -11.1f, 4.6f, -11.4f, 4.9f)
      curveToRelative(-0.3f, 0.3f, 17.5f, 0.5f, 39.6f, 0.5f)
      lineToRelative(40.2f, -0.0f)
      lineToRelative(0.0f, -180.0f)
      lineToRelative(0.0f, -180.0f)
      lineToRelative(-240.0f, -0.0f)
      lineToRelative(-240.0f, -0.0f)
      lineToRelative(0.0f, 180.0f)
      close()
      moveTo(325.6f, 145.4f)
      curveToRelative(2.4f, 2.4f, 4.4f, 4.9f, 4.4f, 5.5f)
      curveToRelative(0.0f, 0.6f, -1.5f, -0.3f, -3.3f, -2.2f)
      curveToRelative(-1.8f, -1.8f, -5.2f, -3.8f, -7.6f, -4.5f)
      curveToRelative(-4.4f, -1.4f, -4.7f, -3.2f, -0.4f, -3.2f)
      curveToRelative(1.7f, -0.0f, 4.0f, 1.5f, 6.9f, 4.4f)
      close()
    }
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(124.5f, 228.0f)
      curveToRelative(-0.3f, 0.5f, -0.1f, 1.0f, 0.4f, 1.0f)
      curveToRelative(0.6f, -0.0f, 1.1f, -0.5f, 1.1f, -1.0f)
      curveToRelative(0.0f, -0.6f, -0.2f, -1.0f, -0.4f, -1.0f)
      curveToRelative(-0.3f, -0.0f, -0.8f, 0.4f, -1.1f, 1.0f)
      close()
    }
    path(fill = SolidColor(Color(0xFF000000)), stroke = SolidColor(Color(0x00000000)),
        strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
        4.0f, pathFillType = NonZero) {
      moveTo(119.0f, 229.0f)
      curveToRelative(0.0f, 0.5f, 0.5f, 1.0f, 1.1f, 1.0f)
      curveToRelative(0.5f, -0.0f, 0.7f, -0.5f, 0.4f, -1.0f)
      curveToRelative(-0.3f, -0.6f, -0.8f, -1.0f, -1.1f, -1.0f)
      curveToRelative(-0.2f, -0.0f, -0.4f, 0.4f, -0.4f, 1.0f)
      close()
    }
  }
  .build()
