package me.arndc.example.patterns.mvp.java;

import me.arndc.example.patterns.mvp.java.domain.Pattern;

final class MainPresenter implements MainContract.UserActionListener {

    private final MainContract.View view;

    MainPresenter(final MainContract.View view) {
        this.view = view;
    }

    @Override
    public void requestInformation(final String abbreviation) {
        // do the actual request here
        // for testing purposes this will be dummy data.

        if ("MVP".equals(abbreviation)) {
            final Pattern pattern = new Pattern("Model View Presenter",  abbreviation);
            view.showInformation(pattern);
        } else {
            view.showError(String.format("Pattern %s unknown", abbreviation));
        }
    }
}
