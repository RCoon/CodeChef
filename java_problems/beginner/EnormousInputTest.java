package java_problems.beginner;

import java.util.Scanner;

class EnormousInputTest {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int t;
        int count = 0;
        for (int i = 0; i < n; i++) {
            t = sc.nextInt();
            if (t % k == 0) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}