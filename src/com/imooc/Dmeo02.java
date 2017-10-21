package com.imooc;
/*
 * 程序功能：实现接收三个班级，每个班级个三名学生的成绩信息，并计算出各个班级学生成绩的平均值并输出
 */
import java.util.Scanner;
public class Dmeo02 {
   public static void main(String[] args) {
	   int classnum=3;
	   int stunum=3;
	   int sum=0;
	   double avg=0;
	   Scanner input=new Scanner(System.in);//创建Scanner对象
	   for(int i=1;i<=classnum;i++) {       //外层循环控制班级
		   System.out.println("****请输入第"+i+"个班级的成绩***");
		   for(int j=1;j<=stunum;j++) {     //内层循环控制学生
			   System.out.print("请输入第"+j+"名学生的成绩");
			int score=input.nextInt();
			   sum=sum+score;
		   }
		   avg=sum/stunum;
		   System.out.println("第"+i+"班学生的平均成绩是"+avg);
		   sum=0;
	   }
   }
}
