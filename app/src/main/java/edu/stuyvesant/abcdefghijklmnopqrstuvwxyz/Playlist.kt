package edu.stuyvesant.abcdefghijklmnopqrstuvwxyz

class Playlist(var files: List<MusicFile>, var name: String) {
    private var currentlyOn: Int = 0

    fun removeInvalidFiles() {
        throw NotImplementedError()
    }

    fun addFile(file: MusicFile) {
        throw NotImplementedError()
    }

    fun removeFile(file: MusicFile) {
        throw NotImplementedError()
    }

    fun rename(new: String) {
        throw NotImplementedError()
    }

    fun getNext(): MusicFile {
        throw NotImplementedError()
    }

    fun gotoFile(index: Int) {
        throw NotImplementedError()
    }

    fun gotoStart() {
        gotoFile(0)
    }
}
