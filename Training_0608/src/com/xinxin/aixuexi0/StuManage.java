package com.xinxin.aixuexi0;

import java.util.Scanner;

public class StuManage {
	public static void main(String[] args) {
		
		StudentFunction StuFunction=new StudentFunction();
		Scanner input=new Scanner(System.in);
		int num;
		
		do {
			printMenu();
			num=input.nextInt();
			switch(num) {
			
			case 1:
				//增
				StuFunction.addStudent();
				break;
			case 2:
				//删
				StuFunction.delStudent();
				break;
			case 3:
				//改
				StuFunction.updateStu();
				break;
			case 4:
				//查 One
				StuFunction.selectOne();
				break;
			case 5:
				//查  All
				StuFunction.selectAll();
				break;
			case 0:
				System.out.println("Dear Friend,Are you Exit?(按y退出，按任意键继续)");
				String choice=input.next();
				if(choice.equalsIgnoreCase("y")) {
					System.out.println("谢谢使用！");
					System.exit(0);//将Java虚拟机的内容停掉
				}
				break;
			default:
				System.out.println("不在范围内，请重新输入：");
				break;
			}
		}while(true);
	}

	private static void printMenu() {
		System.out.println("-------      吴以琳       学生管理系统 V 1.0     -----");
		System.out.println("-------------------------------------------");
		System.out.println("-------1.添加学生信息                        2.删除学生信息        ----");
		System.out.println("-------3.修改学生信息                        4.查询单个学生信    ----");
		System.out.println("-------5.查询全部学生信息                 0.退出系统               ----");
		System.out.println("-------------------------------------------");
		System.out.println("-------请选择：                                                                         ----");

	}

}
