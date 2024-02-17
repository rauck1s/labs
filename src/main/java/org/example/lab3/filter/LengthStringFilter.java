package org.example.lab3.filter;

public class LengthStringFilter implements Filter {
    public boolean apply(String str){
        return (str.length() > 6);
    }

}
