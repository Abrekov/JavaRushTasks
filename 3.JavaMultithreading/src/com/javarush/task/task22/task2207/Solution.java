package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader cReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(cReader.readLine()));
        StringBuilder revWord = new StringBuilder();
        ArrayList<String> words = new ArrayList<>();

        while (fileReader.ready()) {
            String[] wordsInLine = fileReader.readLine().split("\\s+");
            words.addAll(Arrays.asList(wordsInLine));
        }

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            for (int j = i + 1; j < words.size(); j++) {
                revWord.append(words.get(j)).reverse();
                if (word.equals(revWord.toString())) {
                    Pair pair = new Pair();
                    pair.first = word;
                    pair.second = words.get(j);
                    if (!result.contains(pair)) {
                        result.add(pair);
                    }
                }
                revWord.delete(0, revWord.length());
            }
        }
        cReader.close();
        fileReader.close();
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                        first == null ? second :
                            second == null ? first :
                                first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
