package me.arndc.example.patterns.mvp.kotlin

import me.arndc.example.patterns.mvp.kotlin.domain.Pattern

class MainPresenter(private val view: MainContract.View) : MainContract.UserActionListener {

    override fun requestInformation(abbreviation: String) {
        // do the actual request here
        // for testing purposes this will be dummy data.

        if ("MVP" == abbreviation) {
            val pattern = Pattern("Model View Presenter", abbreviation)
            view.showInformation(pattern)
        } else {
            view.showError(String.format("Pattern %s unknown", abbreviation))
        }
    }
}
