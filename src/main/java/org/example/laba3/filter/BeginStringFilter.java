package org.example.laba3.filter;

public class BeginStringFilter implements Filter {
    private final String pattern;

    public BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean apply(String string) {
        return string.substring(0, pattern.length()).equals(pattern);
    }
}
