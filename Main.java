package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    int choice =0;

    while(choice!=3){
    System.out.println(" Enter 1 for for module \n 2- for module 2");
        choice=scan.nextInt();
        if(choice==1){
            Module1 obj=new Module1();
            System.out.println("Enter student name");
            obj.name=scan.nextLine();
            obj.name=scan.nextLine();
            System.out.println("Enter student father name ");
obj.fname=scan.nextLine();
            System.out.println("Enter University id");
            obj.uni_id=scan.nextLine();
            System.out.println("Enter student id");
            obj.user_id=scan.nextLine();
System.out.println("Enter semester");
obj.semester=scan.nextInt();

obj.getdata(obj.name,obj.fname,obj.user_id,obj.uni_id,obj.semester);
obj.setdata();


        }
else if(choice==2){
    Modeule2 obj2=new Modeule2();
    obj2.chemistry();
    obj2.Biology();
    obj2.physics();


        }

    }





    }
}
