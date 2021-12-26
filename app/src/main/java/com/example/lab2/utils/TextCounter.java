package com.example.lab2.utils;

import android.widget.Toast;

import com.example.lab2.MainActivity;

public class TextCounter {

    public static int getCharsCount(String phrase){
        if (phrase != null && phrase.length() != 0 && phrase != "" && phrase != " " && phrase.length() < 100) {
            return phrase.length();
        }
        else {
            return 0;
        }
    }

    public static int getWordsCount(String phrase){
        if (phrase != null && phrase.length() != 0 && phrase.trim().length() > 0 && phrase.length() < 100){
            String[] text_string = phrase.toString().split("\\s+");
            int number = text_string.length;
            return number;
        }
        else {
            return 0;
        }
    }

}
