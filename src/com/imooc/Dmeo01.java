package com.imooc;
import java.util.Scanner;
public class Dmeo01 {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
    	System.out.print("�����뿼�Գɼ���");
    	int score=input.nextInt();
    	int count=0;
    	System.out.println("�ӷ�ǰ�ĳɼ���"+score);
    	while(score<60) {
    		score++;
    		count++;
    	}
    	System.out.println("�ӷֺ�ĳɼ���"+score);
    	System.out.println("������"+count+"�Σ�");
    }
}
