package com.example.springtest.Bean;
import java.util.Scanner;

public class tes1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("请输入工龄：");
        int age = sc.nextInt();
        //System.out.println("请输入基本薪资：");
        int salary = sc.nextInt();
        int addSalary=0;
        if(age>=15||age<0) {
            System.out.println("您输入的工龄不合法~");
            return ;
        } else if(age<1) {
            addSalary = 200;
        } else if(age<3){
            addSalary = 500;
        } else if(age<5) {
            addSalary = 1000;
        } else if(age<10) {
            addSalary = 2500;
        } else{
            addSalary = 5000;}

        System.out.println("您目前工作了"+age+
                "年，基本工资为 "+salary+"元, 应涨工资 "+
                addSalary+"元,涨后工资 "+(salary+addSalary)+"元");
    }
}


