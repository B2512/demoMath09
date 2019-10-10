package yeqingnan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入成绩：");
        double grade = sc.nextDouble();
        String result = grade >= 90 ? "A" : grade >= 60 ? "B" : "C";
        System.out.println(result);
    }
}
