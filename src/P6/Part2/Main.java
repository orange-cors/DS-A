package P6.Part2;
import java.util.Scanner;

/*
Giải thuật đệ quy cho bài toán tháp hà nội:
    chuyen(n, A, B, C) { 
        if (n == 1) { 
            //Chuyển một đĩa từ cọc A sang cọc C } 
        else { 
            chuyen(n – 1, A, C, B);
            chuyen(1, A, B, C); 
            chuyen(n – 1, B, A, C); 
        } 
    }
*/

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void chuyen(int n, String A, String B, String C) { 
        if (n == 1) { 
            System.out.println("Chuyen dia 1 dia tu coc " + A + " sang " + C);
        } 
        else { 
            chuyen(n - 1, A, C, B);
            chuyen(1, A, B, C); 
            chuyen(n - 1, B, A, C); 
        } 
    }
    public static void main(String[] args) {
        System.out.print("Nhap so n: ");
        int n = sc.nextInt();
        String A = "A";
        String B = "B";
        String C = "C";
        chuyen(n, A, B, C);
    }
    
}
