package fr.coderetreat.anykata.anykata.linkedlist.palindrome;

import java.util.LinkedList;
import java.util.Stack;

public class PalindromeKata {

    public boolean isPalindrome(LinkedList<Character> linkedlist) {
        Stack<Character> stack = new Stack<>();

        int middle = linkedlist.size() / 2;
        for (int i = 0; i < linkedlist.size(); i ++) {
            if (i <= middle) {
                stack.add(linkedlist.get(i));
            }
            if (i >= middle) {
                Character pop = stack.pop();
                if (pop != linkedlist.get(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
