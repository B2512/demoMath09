package b2512.wuzhangjie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("请输入你的学习成绩:");
        double str = new Scanner(System.in).nextDouble();
        System.out.println(str >= 90 ? "A" : str >= 60 ? "B" : "C");//嵌套三元运算符
    }
}
