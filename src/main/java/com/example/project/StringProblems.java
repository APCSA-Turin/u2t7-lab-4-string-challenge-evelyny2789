package com.example.project; 

public class StringProblems{
    //empty constructor
    public StringProblems(){}


    // Given a string, return true if it ends in "ly".
    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false
    public boolean endsLy(String x){
            //implement code here
            int len = x.length(); 
            if (len < 2) {
                return false; 
            } if (x.substring(len-2, len).equals("ly")){
                return true; 
            } else {
                return false; 
            }
        
    }


    // Given two strings, append them together (known as "concatenation") 
    // and return the result. However, if the concatenation creates a double-char, 
    // then omit one of the chars, so "abc" and "cat" yields "abcat".
    // conCat("abc", "cat") → "abcat"
    // conCat("dog", "cat") → "dogcat"
    // conCat("abc", "") → "abc"
    public String conCat(String s1, String s2){
        //implement code here
        int len1 = s1.length(); 
        int len2 = s2.length(); 
        if (len1 == 0){
            return s2; 
        } if (len2 == 0){
            return s1; 
        } 

        String first = s2.substring(0, 1);
        String last = s1.substring(len1 - 1, len1); 
        if (last.equals(first)){
            return s1.substring(0, len1 - 1) + s2;
        } return s1 + s2;
            
        
    }

    // Given a string, return a version without the first 2 chars. 
    // Except keep the first char if it is 'a' and keep the second char if it is 'b'. 
    // The string may be any length. Harder than it looks.
    // deFront("Hello") → "llo"
    // deFront("java") → "va"
    // deFront("away") → "aay"
    public String deFont(String s1){
        //implement code here 
        if (s1.substring(0,1).equals("a") && s1.substring(1,2).equals("b")){
            return s1;
        } else if (s1.substring(0,1).equals("a")){
            return s1.substring(0,1) + s1.substring(2,s1.length()); 
        } if (s1.substring(1,2).equals("b")){
            return s1.substring(1,2) + s1.substring(2,s1.length()); 
        }
        return s1.substring(2); 
            
    }

    
    // Given a string, if the first or last chars are 'x', 
    // return the string without those 'x' chars, and otherwise 
    // return the string unchanged.
    // withoutX("xHix") → "Hi"
    // withoutX("xHi") → "Hi"
    // withoutX("Hxix") → "Hxi"
    public String withoutX(String s1){
        int len = s1.length(); 
        String first = s1.substring(0,1); 
        String last = s1.substring(len-1, len); 
        if (first.equals("x") && last.equals("x")){
            return s1.substring (1, len-1); 
        } else if (first.equals("x")){
            return s1.substring(1, len); 
        } else if (last.equals("x")){
            return s1.substring(0, s1.length()-1); 
        } 
        return s1; 
    }

    // Given a string str, if the string starts with "f" return "Fizz".
    //  If the string ends with "b" return "Buzz". If both the "f" and "b" 
    //  conditions are true, return "FizzBuzz". In all other cases, return the 
    //  string unchanged. (See also: FizzBuzz Code)
    // fizzString("fig") → "Fizz"
    // fizzString("dib") → "Buzz"
    // fizzString("fib") → "FizzBuzz"
    public String fizzString(String s1){
        int len = s1.length();
        String f = s1.substring(0,1);
        String b = s1.substring(len-1);
        if ((f.equals("f")) && (b.equals("b"))){
            return "FizzBuzz"; 
        } if (f.equals("f")){
            return "Fizz";
        } else if (b.equals("b")){
            return "Buzz"; 
        } 
        return s1; 
        
    }

    // Given an int n, return the string form of the number followed 
    // by "!". So the int 6 yields "6!". Except if the number is 
    // divisible by 3 use "Fizz" instead of the number, and if the 
    // number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
    //  Note: the % "mod" operator computes the remainder after division, so 23 % 10 yields 3.
    //   What will the remainder be when one number divides evenly into another? 
    // fizzString2(1) → "1!"
    // fizzString2(2) → "2!"
    // fizzString2(3) → "Fizz!"
    public String fizzString2(int x){
        if ((x%3 == 0) && (x%5 == 0)){
            return "FizzBuzz!";
        } if (x%3 == 0){
            return "Fizz!"; 
        } if (x%5 == 0){
            return "Buzz!"; 
        } 
        return x + "!"; 
    }
}