package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Lexer lex = new Lexer("test.txt");
        Lexer.Tokenize("test.txt");

    }
}
