package `in`.papaya.notesappmvvm

import androidx.lifecycle.LiveData

class NotesRepository(private val notesDao: NotesDao) {
    suspend fun insertNotes(notes: Notes){
        notesDao.insertNote(notes)
    }

    fun getNotes() : LiveData<ArrayList<Notes>>{
        return notesDao.getNotes()
    }
}