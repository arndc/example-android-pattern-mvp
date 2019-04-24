package me.arndc.example.patterns.mvp.kotlin

import android.os.Bundle
import android.support.wearable.activity.WearableActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import me.arndc.example.patterns.mvp.R
import me.arndc.example.patterns.mvp.kotlin.domain.Pattern

class MainActivity : WearableActivity(), MainContract.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this)
        btn_submit.setOnClickListener { presenter.requestInformation(form.text.toString()) }

        // Enables Always-on
        setAmbientEnabled()
    }

    override fun showInformation(pattern: Pattern) {
        text.text = pattern.name
    }

    override fun showError(message: String) {
        text.setText(R.string.not_found)
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}
