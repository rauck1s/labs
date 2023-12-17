package org.example.laba3.filter;

public class BanWordsFilter implements Filter {
    @Override
    public boolean apply(String str){
        return (str.contains("nigger") ||
                str.contains("gun") ||
                str.contains("rap") ||
                str.contains("drugs") ||
                str.contains("russian")
                );
    }
}
