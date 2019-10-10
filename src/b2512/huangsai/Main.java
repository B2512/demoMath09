package b2512.huangsai;
/* 　
    [条件语句] ? [表达式1] : [表达式2]
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("请输入成绩:");
        int ont = sca.nextInt();
        String two = (ont>=90) ? "A" : (ont>=60) ? "B" : "C";
        System.out.println(two);
    }
}
