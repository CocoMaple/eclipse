package com.imooc;
//  带参带返回值的方法
import java.util.Arrays;
public class Dmeo09 {
public static void main(String[] args) {
	Dmeo09 hello=new Dmeo09();
	int[] scores= {79,52,98,81};
	//调用方法传入数组成绩，并获取成绩的个数
	int count=hello.fangFa(scores);
	System.out.println("共有"+count+"个成绩信息！");
}
/*
 * fangFa功能：将成绩排序并输出，返回成绩的个数
 * 定义一个包含整形数组参数的方法，传入成绩数组
 * 使用Arrays类对成绩数组进行排序并输出
 * 方法执行后返回数组中元素的个数
 */
public int fangFa(int[] shuZu1) {
	Arrays.sort(shuZu1);
	System.out.println(Arrays.toString(shuZu1));
	return shuZu1.length;
}
}
