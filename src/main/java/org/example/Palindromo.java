package org.example;

public class Palindromo {
    public boolean isPalindromo(String input) {
        if (input == null) {
            throw new IllegalArgumentException("La cadena no puede estar vacia");
        }
        String cleaned = input.replaceAll("A-Za-z0-9", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    }