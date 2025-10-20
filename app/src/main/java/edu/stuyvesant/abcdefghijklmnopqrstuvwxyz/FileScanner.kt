package edu.stuyvesant.abcdefghijklmnopqrstuvwxyz

object FileScanner {
    fun scanFiles(): List<MusicFile> {
        throw NotImplementedError()
    }
}

fun main() {
    for (a in FileScanner.scanFiles()) {
        print(a.file)
    }
}