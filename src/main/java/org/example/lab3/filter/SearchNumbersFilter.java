package org.example.lab3.filter;

public class SearchNumbersFilter implements Filter {
    @Override
    public boolean apply(String str){
        return (str.contains("2") ||
                str.contains("4") ||
                str.contains("6") ||
                str.contains("8") ||
                str.contains("0")
                );
    }
}
