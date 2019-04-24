package me.arndc.example.patterns.mvp.java.domain;

public final class Pattern {
    private final String name;
    private final String abbreviation;

    public Pattern(final String name, final String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
