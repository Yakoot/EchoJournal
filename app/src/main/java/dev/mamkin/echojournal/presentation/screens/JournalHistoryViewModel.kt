package dev.mamkin.echojournal.presentation.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn

class JournalHistoryViewModel: ViewModel() {
    private val _uiState = MutableStateFlow<UIState>(UIState.Loading)
    val uiState = _uiState
        .onStart {
            delay(2000)
            _uiState.value = UIState.NoEntries
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000L), UIState.Loading)
}

sealed interface UIState {
    object NoEntries : UIState
    object Loading : UIState
}