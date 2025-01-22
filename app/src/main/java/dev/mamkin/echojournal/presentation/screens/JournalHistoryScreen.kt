package dev.mamkin.echojournal.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import dev.mamkin.echojournal.R
import dev.mamkin.echojournal.presentation.gradientBackground
import dev.mamkin.echojournal.ui.theme.EchoJournalTheme
import dev.mamkin.echojournal.ui.theme.Primary100
import dev.mamkin.echojournal.ui.theme.Primary60

@Composable
fun JournalHistoryScreen(
    modifier: Modifier = Modifier,
    viewModel: JournalHistoryViewModel = viewModel()
) {
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .gradientBackground()
            .safeDrawingPadding(),
        floatingActionButton = {
            // TODO: create gradient and animate
            FloatingActionButton(
                shape = CircleShape,
                containerColor = Primary60,
                contentColor = Primary100,
                onClick = {  },
            ) {
                Icon(Icons.Filled.Add, "Floating action button.")
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        containerColor = Color.Transparent
    ) { innerPadding ->
        Column(modifier = modifier.padding(innerPadding)) {
            Text(
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                text = "Your EchoJournal",
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.headlineLarge
            )
            when (uiState) {
                UIState.Loading -> LoadingState()
                UIState.NoEntries -> EmptyState()
            }
        }
    }
}

@Composable
fun EmptyState(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.no_entries), contentDescription = null)
        Text(
            modifier = Modifier.padding(top = 34.dp),
            text = "No Entries",
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            modifier = Modifier.padding(top = 6.dp),
            text = "Start recording your first Echo",
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun LoadingState() {
    CircularProgressIndicator()
}

@Preview(showBackground = true)
@Composable
private fun EmptyStatePreview() {
    EchoJournalTheme {
        Surface {
            EmptyState()
        }
    }
}
