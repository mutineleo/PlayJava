package org.example.DSA;

import java.util.*;
import java.io.*;


public class URLify {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String str = sc.nextLine();
            Solution obj = new Solution();
            System.out.println(obj.URLify(str));

            System.out.println("~");
        }
    }

}

class Solution {
    String URLify(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i=0; i<s.length(); ) {
            if (s.charAt(i) == ' ' ) {
                ans.append("%20");
                while (i<s.length() && s.charAt(i) == ' ') i++;
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }

        return ans.toString();
    }
}