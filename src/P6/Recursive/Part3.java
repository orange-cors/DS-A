package P6.Recursive;
import java.util.Scanner;


/*
1. Định nghĩa đệ quy tìm ước số chung lớn nhất theo thuật toán Euclid.
    𝑢𝑐𝑙𝑛(𝑎, 𝑏) =  𝑏 𝑛ế𝑢 𝑎 𝑐ℎ𝑖𝑎 ℎế𝑡 𝑐ℎ𝑜 𝑏 
              = 𝑢𝑐𝑙𝑛(𝑏, 𝑎 𝑚𝑜𝑑 𝑏)𝑛ế𝑢 𝑛𝑔ượ𝑐 𝑙ạ𝑖
2. Giải thuật đệ quy tìm ước số chung lớn nhất 
    int ucln(int p, int q){
        int r = p%q;
        if (r == 0) return q;
        else return ucln(q, r); 
    } 
3. Giải thuật lặp 
    int ucln(int p, int q){ 
        int r = p%q; 
        while (r != 0){ 
            p = q; q = r; r = p%q; 
        } return q; 
    }
 */

public class Part3 {
    public static Scanner sc = new Scanner(System.in);

    public static int UCLN(int p, int q){
        int r = p%q;
        if(r==0)
            return q;
        else 
            return UCLN(q, r);
    }

    public static void main(String[] args) {
        System.out.print("Nhap p: ");
        int p =sc.nextInt();
        System.out.print("Nhap q: ");
        int q =sc.nextInt();
        System.out.println("UCLN cua " + p + " va " + q + " la: " + UCLN(p, q));
    }
}
