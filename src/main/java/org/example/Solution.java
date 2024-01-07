package org.example;

class Solution {
    public int titleToNumber(String columnTitle) {
        int titleToNumber = 0;

        for (int i = columnTitle.length() - 1; i >= 0; --i) {
            titleToNumber += Math.pow(26, columnTitle.length() - i - 1) * ((int) columnTitle.charAt(i) - 64);
        }
        return titleToNumber;
    }
}
