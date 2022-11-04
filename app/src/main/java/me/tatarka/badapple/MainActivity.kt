package me.tatarka.badapple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import me.tatarka.badapple.frames.Frames

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BadApple()
        }
    }
}

@Composable
fun BadApple() {
    var playing by remember { mutableStateOf(false) }
    Box(
        Modifier
            .fillMaxSize()
            .clickable { playing = true }
            .background(Color.White)
    ) {
        BadAppleVideo(Modifier.align(Alignment.Center), playing)
    }
}

@Composable
fun BadAppleVideo(modifier: Modifier = Modifier, playing: Boolean = true) {
    val targetFrameNum = if (playing) 6570 else 1
    val frameNum by animateIntAsState(
        targetValue = targetFrameNum, animationSpec = tween(
            durationMillis = 6570 * 1000 / 30,
            easing = LinearEasing
        )
    )
    val frame = remember(frameNum) { Frames[frameNum] }

    Image(frame, contentDescription = null, modifier)
}

@Preview
@Composable
fun BadApplePreview() {
    BadApple()
}