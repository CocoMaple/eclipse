package com.imooc;
//无参带返回值的方法
public class Dmeo07 {
public static void main(String[] args) {
	//创建对象，名为hello
	Dmeo07 hello = new Dmeo07();
	//调用方法并将返回值保存在变量中
	int maxScore=hello.getMaxAge();
	//输出最大年龄
	System.out.println("最大年龄为："+maxScore);
}
public int getMaxAge() {
	//定义一个数组ages来保存年龄
	int[] ages= {18,23,21,19,25,29,17};
	//定义一个变量来保存年龄最大，先假定最大年龄为ages[0]
	int max=ages[0];
	/*使用for函数来遍历数组中的数，并通过if来比较找出
	 * 最大值
	 */
	for(int i=0;i<ages.length;i++) {
		if(max<ages[i]) {
			max=ages[i];
		}
	}
	//利用return来返回方法值 max
	return max;
}
}
