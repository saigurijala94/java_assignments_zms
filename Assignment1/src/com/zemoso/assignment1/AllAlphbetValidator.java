package com.zemoso.assignment1;

import java.util.Scanner;

public class AllAlphbetValidator {

    public static void main(String[] args) {
        System.out.println("Please Enter Text:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if(input == null || input.trim() == ""){
            System.out.println("Not Contains All Alphabets...");
            return;
        }else{
            input = input.toLowerCase();
        }

        if(AllAlphbetValidator.isStringContainsAllAlphabets(input))
            System.out.println("All Alphabets are there.....");
        else
            System.out.println("Not Contains All Alphabets...");
    }


    private static boolean isStringContainsAllAlphabets(String in) {
        boolean visitedAll = true;
        boolean[] visited = new boolean[26];
        for(int i=0; i<in.length(); i++){
             int index = in.charAt(i) - 'a';
            visited[index] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return visitedAll;
    }

}
