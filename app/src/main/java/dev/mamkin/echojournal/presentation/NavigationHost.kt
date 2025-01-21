package dev.mamkin.echojournal.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.mamkin.echojournal.presentation.screens.CreateRecordScreen
import dev.mamkin.echojournal.presentation.screens.JournalHistoryScreen
import kotlinx.serialization.Serializable

@Composable
fun NavigationHost(
    modifier: Modifier = Modifier
) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = JournalHistory) {
        composable<JournalHistory> { JournalHistoryScreen(modifier = modifier) }
        composable<CreateRecord> { CreateRecordScreen(modifier = modifier) }
    }
}

@Serializable
object JournalHistory
@Serializable
object CreateRecord

