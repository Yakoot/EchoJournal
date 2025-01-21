package dev.mamkin.echojournal.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun JournalHistoryScreen(
    modifier: Modifier = Modifier
) {
    Surface(modifier = modifier.background(Color.Transparent)) {
        Text("Journal History")
    }
}