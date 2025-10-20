package edu.stuyvesant.abcdefghijklmnopqrstuvwxyz

import java.util.Date

object StreakTracker {
    private val days: HashSet<Date> = HashSet()

    fun markToday() {
        throw NotImplementedError()
    }

    fun wasDateMarked(date: Date): Boolean {
        throw NotImplementedError()
    }

    fun calculateCurrentStreak(): Int {
        throw NotImplementedError()
    }

    fun giveMotivationalMessage(days: Int): String {
        throw NotImplementedError()
    }
}

fun main() {
    // Tests
}