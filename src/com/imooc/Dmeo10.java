package com.imooc;
//导入Arrays类
import java.util.Arrays;
public class Dmeo10 {
   public static void main(String[] args) {
	   //定义一个整形数组将成绩先储存在其中
	   int[] scores= {89,-23,64,91,119,52,73};
	   System.out.println("考试成绩前三名的成绩为：");
	   //创建对象，对象名为hello
	   Dmeo10 hello=new Dmeo10();
	   //调用方法
	   hello.num(scores);
   }
   /*
    * 定义一个方法使其有以下几个功能
    * 1、可对数组中成绩进行排序
    * 2、对数组中的成绩进行判断，对小于0或大于100的数进行剔除。
    *   并可以将成绩排在前三名的进行输出
    */
   //定义方法名为num和一个整形数组scores1
   public void num(int[] scores1) {
	   //使用Arrays类对score1数组进行排序（默认为由小到大）
	   Arrays.sort(scores1);
	   //定义一个变量，用来统计前三名成绩的数量
	   int count=0;
	     /*
	      * 使用for循环遍历数组中的数,
	      * 注意：由于数组前面是由小到大排列，故在此若要对前三名的成绩进行输出时
	      * 可用倒序输出，但因数组下标是从0开始的。因此for循环中变量i的初始
	      * 值应为scores1.length-1
	      */
	   for(int i=scores1.length-1;i>=0;i--) {
		   //使用if条件语句对成绩有效性进行判断同时对成绩数量进行选择
		   if(scores1[i]>0&&scores1[i]<100&&count<3) {
			   //对符合条件的成绩进行输出
			   System.out.println(scores1[i]);
			   //选择需成绩的数量
			   count++;
		   }
	   }
   }
}
