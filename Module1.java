package com.company;

public class Module1 {
String name,fname,uni_id,user_id;
int semester;


public void getdata(String name,String fname,String uni_id,String user_id,int semeter){

    this.name=name;
    this.fname=fname;
this.uni_id=uni_id;
this.user_id=user_id;
this.semester=semester;

}
public void setdata(){

    System.out.println(" Student name is  "+name );
    System.out.println(" Studnet father name is"+ fname );
    System.out.println(" Univer sity id is "+uni_id);
    System.out.println("  User  id is"+ user_id );
    System.out.println(" semester  "+semester);

}



}
