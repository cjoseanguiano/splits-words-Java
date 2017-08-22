package com.devix.www;

public class Main {

    public static void main(String[] args) {
        String line = "hello, how are you";
        String[] words = line.split("\\W+");
        System.out.println(words.length);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
