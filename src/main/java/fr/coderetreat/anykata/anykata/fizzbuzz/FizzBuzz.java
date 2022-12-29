package fr.coderetreat.anykata.anykata.fizzbuzz;

public class FizzBuzz {

    public String fizzbuzz(int i) {
        if (i % 5 == 0 && i % 3 == 0) {
            return "FizzBuzz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);
    }
}
