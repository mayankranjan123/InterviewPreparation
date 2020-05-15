package com.company.dataStructures;

public class MinimumStringWindow {
    public static void main(String[] args) {
        String s = "abcefdj";
        String t = "cd";

        String res = "";
        int[] letterCount = new int[128];
        int left = 0, count = 0, minLen = Integer.MAX_VALUE;

        for (char c : t.toCharArray())
           ++ letterCount[c];

        for (int right = 0; right < s.length(); ++ right) {
            if (-- letterCount[s.charAt(right)] >= 0)
                ++ count;

            while (count == t.length()) {
                if (minLen > right - left + 1) {
                    minLen = right - left + 1;
                    res = s.substring(left, right + 1);
                }
                if (++ letterCount[s.charAt(left)] > 0)
                    -- count;
                ++ left;
            }
        }
        System.out.println(res);
    }
}
