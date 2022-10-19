//Написать программу вычисления n-ого треугольного числа.

import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Введите число n: ");
			int n = scan.nextInt();
			int res = n*(n + 1)/2;
   System.out.print(res);
		}
    }
}