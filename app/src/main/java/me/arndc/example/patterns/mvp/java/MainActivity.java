package me.arndc.example.patterns.mvp.java;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import me.arndc.example.patterns.mvp.R;
import me.arndc.example.patterns.mvp.java.domain.Pattern;

public final class MainActivity extends WearableActivity implements MainContract.View {

    private TextView mTextView;
    private TextView mFormEditText;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter(this);
        mTextView = findViewById(R.id.text);
        mFormEditText = findViewById(R.id.form);
        Button mSubmitButton = findViewById(R.id.btn_submit);

        mSubmitButton.setOnClickListener(v -> presenter.requestInformation(
                String.valueOf(mFormEditText.getText())
        ));

        // Enables Always-on
        setAmbientEnabled();
    }

    @Override
    public void showInformation(Pattern pattern) {
        mTextView.setText(pattern.getName());
    }

    @Override
    public void showError(String message) {
        mTextView.setText(getString(R.string.not_found));
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
