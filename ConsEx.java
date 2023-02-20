// constructor example 
// this reference

package com.semanticsquare.Constructors;

public class ConsEx {
    String name;
    String gender;
    int age;


    ConsEx(String name,String gender,int age){
       this.name=name;
       this.gender=gender;
       this.age=age;
    }

    ConsEx(){

    }
    
    void get(){
        System.out.println("name "+name);
        System.out.println("gender "+gender);
        System.out.println("age "+age);

    }

    public static void main(String[] args) {
        ConsEx c1= new ConsEx("vibhu", "male", 23);
        c1.get();
        ConsEx c2= new ConsEx("abc", "female", 25);
        c2.get();
        ConsEx c3= new ConsEx();
        c3.get();
    }
}
