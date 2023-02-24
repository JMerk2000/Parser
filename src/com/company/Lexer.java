package com.company;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Lexer {

    public static void Tokenize(String fileName){

        HashMap<String, String> map = new HashMap<String, String>();
        String intPattern = "\\d+";
        String varPattern = "[a-zA-Z]\\w*";

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
        map.put("intNum","INT_CONST");
        map.put("test", "IDENT");

        String word = "";


        List<String> cars = new ArrayList<String >();
        //System.out.println(map.keySet());

        //Write loop that reads from file char by char and adds to blank string. If blank string letters make up a word, add it to the arraylist

         String input;
        try {
            File in = new File(fileName);
            Scanner sc = new Scanner(in);


            while (sc.hasNext()) {
                input = sc.nextLine();

                for (char c : input.toCharArray()) { //reads file character by character
                    word = word + c;                 // Adds each character to an empty string
                    System.out.println(word);
                    word = word.replaceAll("\\s", "");          //Removes spaces

                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (word.equals(entry.getKey())) {         //If word is found in empty string, add it to the ArrayList

                            System.out.println("Found a matching key : " + word);
                            cars.add(word);
                            word = "";                       // Set string back to empty for next word
                        } else if (word.matches(intPattern)) {
                            System.out.println("Found a matching key : " + word);
                            word = "intNum";
                            cars.add(word);
                            word = "";
                        /**} else if(word.matches(varPattern) && !word.equals(entry.getKey())){
                            System.out.println("Found a matching key : " + word);
                            word = "test";
                            cars.add(word);
                            word = ""; */
                        }

                    }
                }
            }




            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

            String iterator;

            for(int i = 0; i <= cars.size()-1; i++){
                iterator = cars.get(i);

                for (Map.Entry<String, String> entry : map.entrySet()) { //Iterate through map
                    if (entry.getKey().equals(iterator)) {               // If key equals arraylist entry, print value of key
                        System.out.println(entry.getValue());
            }

        }

        }
    }

}



