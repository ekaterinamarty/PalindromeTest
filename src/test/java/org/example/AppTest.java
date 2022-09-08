package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    @DisplayName("Null test")
    void Test1() {
        assertThat(App.isPalindrome(null), equalTo(false));
    }

    @Test
    @DisplayName("Empty test")
    void Test2() {
        assertThat(App.isPalindrome(""), equalTo(false));
    }

    @Test
    @DisplayName("Whitespace test")
    void Test3() {
        assertThat(App.isPalindrome(" "), equalTo(false));
    }

    @Test
    @DisplayName("Punctuation test")
    void Test4() {
        assertThat(App.isPalindrome(","), equalTo(false));
    }

    @ParameterizedTest
    @DisplayName("True palindrome test")
    @ValueSource(strings = {
            "As I pee, sir, I see Pisa!",
            "Sit on a potato pan, Otis.",
            "A man, a plan, a canal: Panama.",
            "Amy? Must I jujitsu my ma?",
            "A nut for a jar of tuna.",
            "Murder for a jar of red rum.",
            "Doc, note I dissent: a fast never prevents a fatness. I diet on cod.",
            "Oh, who was it I saw? Oh, who?",
            "Cigar? Toss it in a can. It is so tragic.",
            "Pull up, Eva! we're here! Wave! Pull up!"
    })
    void Test5(String input) {
        assertThat(App.isPalindrome(input), equalTo(true));
    }

    @ParameterizedTest
    @DisplayName("Not a palindrome test")
    @ValueSource(strings = {
            "Random text",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
    })
    void Test6(String input) {
        assertThat(App.isPalindrome(input), equalTo(false));
    }

    @ParameterizedTest
    @DisplayName("Homework examples: true palindromes")
    @ValueSource(strings = {
            "A roza upala na Lapu Azora",
            "abba",
            "aba",
            "a  aab a aa",
            "Ab bB a"
    })
    void Test7(String input) {
        assertThat(App.isPalindrome(input), equalTo(true));
    }

    @ParameterizedTest
    @DisplayName("Homework examples: false palindromes")
    @ValueSource(strings = {
            "a  aab a a",
            "abbc"
    })
    void Test8(String input) {
        assertThat(App.isPalindrome(input), equalTo(false));
    }
}
