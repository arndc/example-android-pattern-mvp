package me.arndc.example.patterns.mvp.java;

import me.arndc.example.patterns.mvp.java.domain.Pattern;

interface MainContract {

    interface View {

        void showInformation(final Pattern pattern);

        void showError(final String message);
    }

    interface UserActionListener {

        void requestInformation(final String abbreviation);
    }
}
