package me.arndc.example.patterns.mvp.kotlin

import me.arndc.example.patterns.mvp.kotlin.domain.Pattern

interface MainContract {

    interface View {

        fun showInformation(pattern: Pattern)

        fun showError(message: String)
    }

    interface UserActionListener {

        fun requestInformation(abbreviation: String)
    }
}
