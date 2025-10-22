package P6.Part1;

import java.util.Scanner;

/*
1. Định nghĩa đệ quy tìm số fibonaci thứ n
𝑓(𝑛) = { 1 𝑛ế𝑢 𝑛 = 1 ℎ𝑜ặ𝑐 𝑛 = 2
     = 𝑓(𝑛 − 1) + 𝑓(𝑛 − 2) 𝑛ế𝑢 𝑛 > 2
2. Giải thuật đệ quy tìm số fibonaci thứ n
fibo(n) { if ( n <= 2) return 1;
    else return fibo(n – 1) + fibo(n – 2);
*/

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static int Fib(int n) {
        if(n==0)
            return 0;
        else if (n <= 2)
            return 1;
        else
            return Fib(n - 1) + Fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        System.out.println("So Fib thu " + n + " la: " + Fib(n));

        for (int i = 0; i <= n; i++) {
            System.out.print(Fib(i) + " ");
        }
    }
}
