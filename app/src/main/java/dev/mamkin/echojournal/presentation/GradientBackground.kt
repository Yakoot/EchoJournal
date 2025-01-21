package dev.mamkin.echojournal.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import dev.mamkin.echojournal.ui.theme.Primary90
import dev.mamkin.echojournal.ui.theme.Primary95

@Composable
fun GradientBackground(
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(
        modifier = modifier
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Primary90.copy(alpha = 0.4f),
                        Primary95.copy(alpha = 0.4f),
                    )
                )
            )
    ) { content() }
}