package liwenjian;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner input=new Scanner(System.in);
        System.out.println("请输入成绩：");
        int achievements=input.nextInt();
        //这条语句的意思是，如果A>B的话，就将100赋给C，否则就将200赋给C；
        String y=(achievements>=90)? "A":(achievements>=60)? "B":"C";
        System.out.println(y);
    }
}
