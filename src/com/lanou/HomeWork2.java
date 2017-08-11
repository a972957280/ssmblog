package com.lanou;

public class HomeWork2 {

	/*
	 * 主函数（入口函数）
	 */
	public static void main(String[] args) {

		// 题目一
		// 打印
		System.out.println("helloworld");

		
		// 题目二
		//打印
		System.out.println("************");
		System.out.println("****JAVA****");
		System.out.println("************");

		
		// 题目三
		// 步骤：
		// 1.定义7个常规变量，1个特殊变量
		// 2.计算100元的张数
		// 3：计算出整张100元后剩余的钱数
		// 4：使用剩余的钱数计算整张50元的张数
		// 5：计算除去整张50元后剩余的张数
		// 6：使用剩余的钱数计算整张20元的张数
		// 7：计算除去整张20元后剩余的张数
		// 8：使用剩余的钱数计算整张10元的张数
		// 9：计算除去整张10元后剩余的张数
		// 10：使用剩余的钱数计算整张5元的张数
		// 11：计算除去整张5元后剩余的张数
		// 12：使用剩余的钱数计算整张1元的张数
		// 13：打印

		// 编程
		// 1.定义7个常规变量，1个特殊变量
		int num = 189;
		int min100, min50, min20, min10, min5, min1;
		int remainder;
		// 2.计算100元的张数
		min100 = num / 100;
		// 3：计算出整张100元后剩余的钱数
		remainder = num % 100;
		// 4：使用剩余的钱数计算整张50元的张数
		min50 = remainder / 50;
		// 5：计算除去整张50元后剩余的张数
		remainder = remainder % 50;
		// 6：使用剩余的钱数计算整张20元的张数
		min20 = remainder / 20;
		// 7：计算除去整张20元后剩余的张数
		remainder = remainder % 20;
		// 8：使用剩余的钱数计算整张10元的张数
		min10 = remainder / 10;
		// 9：计算除去整张10元后剩余的张数
		remainder = remainder % 10;
		// 10：使用剩余的钱数计算整张5元的张数
		min5 = remainder / 5;
		// 11：计算除去整张5元后剩余的张数
		remainder = remainder % 5;
		// 12：使用剩余的钱数计算整张1元的张数
		min1 = remainder / 1;
		// 13：打印
		System.out.println("100元的张数为：" + min100 + "," + "50元的张数为：" + min50 + "," + "20元的张数为：" + min20 + "," + "10元的张数为："
				+ min10 + "," + "5元的张数为：" + min5 + "," + "1元的张数为：" + min1);

		
		// 题目四：
		// 步骤：
		// 1：定义2个变量
		// 2：求余数并打印
		// 3：主观判断（商的结果是否+1），并求出商，打印结果

		// 1：定义2个变量
		int n1 = 55;
		int n2 = 2;
		// 2：求余数并打印
		int n = n1 % n2;
		System.out.println(n);
		// 3：主观判断（商的结果是否+1），并求出商，打印结果
		int res = n1 / n2 + 1;
		System.out.println(res);

		// double d1=55.0;
		// double d2=2.0;
		// double d=d1/d2;
		// System.out.println(d);
		// System.out.println(Math.round(d));

		
		// 题目五
		// 步骤：
		// 1：定义2个变量并赋初始值
		// 2：将变量b中的值倒入变量a中（此时变量a中的值为变量a和b的和）
		// 3：将原来变量a中的值赋值给变量b（此时变量b中的值为原来变量a的值）
		// 4：将原来变量b中的值赋值给变量a（此时变量a中的值为原来变量b的值）
		// 5：打印变量a和b的值

		// 编程
		// 1：定义2个变量并赋初始值
		int a = 3;
		int b = 5;
		// 2：将变量b中的值倒入变量a中（此时变量a中的值为变量a和b的和）
		a = a + b;
		// 3：将原来变量a中的值赋值给变量b（此时变量b中的值为原来变量a的值）
		b = a - b;
		// 4：将原来变量b中的值赋值给变量a（此时变量a中的值为原来变量b的值）
		a = a - b;
		// 5：打印变量a和b的值
		System.out.println("现在a中的值为：" + a + "," + "现在b中的值为：" + b);

	}
}
