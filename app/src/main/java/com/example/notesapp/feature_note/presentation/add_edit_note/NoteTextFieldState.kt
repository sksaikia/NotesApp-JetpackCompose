package com.example.notesapp.feature_note.presentation.add_edit_note

import androidx.compose.runtime.Composable

data class NoteTextFieldState(
    val text : String = "",
    val hint : String = "",
    val isHintVisible : Boolean = true
)