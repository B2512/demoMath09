package b2512.zhangguihong;

import java.util.Scanner;

public class Main {
   public static void main(String args[]){
       Scanner scan=new Scanner(System.in);
       System.out.println("请输入成绩:");
       int score=scan.nextInt();
       System.out.println(score>=90?"A":score>=60?"B":"C");
   }

}
