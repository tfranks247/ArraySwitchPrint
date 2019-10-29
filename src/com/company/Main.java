package com.company;

public class Main {

    public static void main(String[] args) {

        char [] lettersArray = {'w', 't', 'y', 'h', 'k' };

        for (char c : lettersArray){ // char c is being created to go through every character in the array
            // when c == 't' print hello
            // you can do this and change whats printed as long as know what element your trying to pull
            // out of the array
            if (c == 't')
                System.out.println("Hello");
            }
	// write your code here
    }
}

// 8. Given the following array: ['w','t','y','h','k']
//Loop through the array and replace the the letter 't' with the word "hello" once it's found.

// OR for (int i = 0; i < lettersArray.length; i++)
//            if (lettersArray[i] == 't'){