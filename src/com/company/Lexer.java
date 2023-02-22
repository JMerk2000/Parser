package com.company;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Lexer {
    public Lexer(String fileName) {}

    public static void Tokenize(String fileName){

        HashMap<String, String> map = new HashMap<String, String>();

        map.put("if", "IF");
        map.put("for", "FOR");
        map.put("while", "WHILE");
        map.put("procedure", "PROC");
        map.put("return", "RETURN");
        map.put("int", "INT");
        map.put("else", "ELSE");
        map.put("do", "DO");
        map.put("break", "BREAK");
        map.put("end", "END");
        map.put("=", "ASSIGN");
        map.put("+", "ADD_OP");
        map.put("-", "SUB_OP");
        map.put("*", "MUL_OP");
        map.put("/", "DIV_OP");
        map.put("%", "MOD_OP");
        map.put(">", "GT");
        map.put("<", "LT");
        map.put(">=", "GE");
        map.put("<=", "LE");
        map.put("++", "INC");
        map.put("(", "LP");
        map.put(")", "RP");
        map.put("{", "LB");
        map.put("}", "RB");
        map.put("|", "OR");
        map.put("&", "AND");
        map.put("==", "EE");
        map.put("!", "NEG");
        map.put(",", "COMMA");
        map.put(";", "SEMI");

        String word = "";

        List<String> cars = new ArrayList<String >();

         String input = null;
        try {
            File in = new File(fileName);
            Scanner sc = new Scanner(in);


            while (sc.hasNext()) {
                input = sc.nextLine();
                cars.add(input);

            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

            String iterator = null;

            for(int i = 0; i <= cars.size()-1; i++){
                iterator = cars.get(i);

                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (entry.getKey().equals(iterator)) {
                        System.out.println(entry.getValue());
            }

        }

        }
    }

}


