package com.imooc;
import java.util.Scanner;
public class Dmeo01 {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	System.out.print("请输入考试成绩：");
    	int score=input.nextInt();
    	int count=0;
    	System.out.println("加分前的成绩："+score);
    	while(score<60) {
    		score++;
    		count++;
    	}
    	System.out.println("加分后的成绩："+score);
    	System.out.println("共加了"+count+"次！");
    }
}
