package hu.adam.codeWarsExercises.sevenKyuExercises;


import java.util.Deque;
import java.util.LinkedList;
import java.util.StringJoiner;

public class ReverseWords {
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        Deque<String> stack = new LinkedList<>();
        for (String word : words) {
            stack.push(word);
        }
        StringJoiner stringJoiner = new StringJoiner(" ");
        while (!stack.isEmpty()) {
            stringJoiner.add(stack.pop());
        }
        return stringJoiner.toString();
    }
}
