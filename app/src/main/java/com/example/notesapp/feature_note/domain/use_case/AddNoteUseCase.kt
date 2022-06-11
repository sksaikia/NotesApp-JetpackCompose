package com.example.notesapp.feature_note.domain.use_case

import com.example.notesapp.feature_note.domain.model.InvalidNoteException
import com.example.notesapp.feature_note.domain.model.Note
import com.example.notesapp.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note : Note) {
        if (note.title.isEmpty()) {
            throw InvalidNoteException("Title can not be empty")
        }
        if (note.content.isEmpty()) {
            throw InvalidNoteException("The content can not be empty")
        }
        repository.insertNote(note)

    }

}