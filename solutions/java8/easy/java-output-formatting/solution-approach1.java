// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// Problem     Java Output Formatting
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-11-16, 12:40 p.m.
// Technique   printf-formatted-string-padding
// Time        O(1)
// Space       O(1)
// Insight     The implementation utilizes Java's printf format specifiers to enforce left-justification for strings and zero-padding for integers within a fixed-width output stream.
// Interview   Before: "I would manually calculate string lengths and pad with spaces or zeros." After: "Using printf format specifiers like %-15s and %03d allows for O(1) time complexity and cleaner code, ensuring the output strictly adheres to the 15-character left-justification and 3-digit zero-padding requirements."
// Pitfalls    (1) Using %15s instead of %-15s results in right-justification, violating the requirement for left-justification.  (2) Omitting the %n format specifier causes output to appear on a single line instead of separate lines.  (3) Using %3d instead of %03d fails to pad integers with leading zeros, violating the three-digit requirement.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");
            sc.close();

    }
}



