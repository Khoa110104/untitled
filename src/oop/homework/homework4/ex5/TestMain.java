package oop.homework.homework4.ex5;

import homework.homework4.ex5.PalindromeCheck;

public class TestMain {
    public static void main(String[] args) {
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        String str = "madam";
        String str2 = "K67a4";
        if (palindromeCheck.isPalindrome(str)) {
            System.out.println(str + ": là chuỗi Palindrome");
        } else {
            System.out.println(str + ": không phải chuỗi Palindrome ");
        }

        if (palindromeCheck.isPalindrome(str2)) {
            System.out.println(str2 + ": là chuỗi Palindrome");
        } else {
            System.out.println(str2 + ": không phải chuỗi Palindrome ");
        }
    }
}
