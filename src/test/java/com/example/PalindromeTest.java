package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    Palindrome p = new Palindrome();

    @Test
    void test1() { assertTrue(p.isPalindrome("madam")); }

    @Test
    void test2() { assertTrue(p.isPalindrome("racecar")); }

    @Test
    void test3() { assertTrue(p.isPalindrome("level")); }

    @Test
    void test4() { assertFalse(p.isPalindrome("hello")); }

    @Test
    void test5() { assertFalse(p.isPalindrome("java")); }

    @Test
    void test6() { assertTrue(p.isPalindrome("a")); }

    @Test
    void test7() { assertTrue(p.isPalindrome("")); }

    @Test
    void test8() { assertFalse(p.isPalindrome("chatgpt")); }

    @Test
    void test9() { assertTrue(p.isPalindrome("noon")); }

    @Test
    void test10() { assertFalse(p.isPalindrome("world")); }
}