// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
// Problem     Java If-Else
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-10-29, 03:18 p.m.
// Technique   conditional-branching-logic
// Time        O(1)
// Space       O(1)
// Insight     The solution categorizes the integer N based on parity and specific inclusive range thresholds using a sequence of if-else statements.
// Interview   Before: "I would use a series of nested if-else blocks to check the parity and range conditions." After: "The implementation uses O(1) time and space to evaluate the four distinct conditions, correctly handling the inclusive range boundaries like 2, 5, 6, and 20 as specified."
// Pitfalls    (1) Failing to account for the inclusive nature of the ranges 2 to 5 and 6 to 20.  (2) Incorrectly ordering the conditional checks, which could lead to overlapping logic for even numbers.  (3) Neglecting the parity check for odd numbers, which must be evaluated first to satisfy the problem requirements.
// ──────────────────────────────────────────────────

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N % 2 !=0){
          System.out.println("Weird");
          }  
          else if (N>=2 && N<= 5){
            System.out.println("Not Weird");
            }
            else if (N >= 6 && N <= 20){
            System.out.println("Weird");
            }
            else{
              System.out.println("Not Weird");
              }
        scanner.close();
    }
}
