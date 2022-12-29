package fr.coderetreat.anykata.anykata.linkedlist.palindrome;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class PalindromeKataTest {

    @Test
    public void should_be_a_palindome() {
        PalindromeKata palindromeKata = new PalindromeKata();
        LinkedList<Character> linkedList = new LinkedList<>() {{
            add('a');
            add('b');
            add('a');
        }};
        boolean result = palindromeKata.isPalindrome(linkedList);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void should_be_a_palindome_2() {
        PalindromeKata palindromeKata = new PalindromeKata();
        LinkedList<Character> linkedList = new LinkedList<>() {{
            add('c');
            add('a');
            add('a');
            add('b');
            add('a');
            add('a');
            add('c');
        }};
        boolean result = palindromeKata.isPalindrome(linkedList);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void should_not_be_a_palindome() {
        PalindromeKata palindromeKata = new PalindromeKata();
        LinkedList<Character> linkedList = new LinkedList<>() {{
            add('a');
            add('b');
            add('b');
        }};
        boolean result = palindromeKata.isPalindrome(linkedList);
        Assertions.assertThat(result).isFalse();
    }
}
