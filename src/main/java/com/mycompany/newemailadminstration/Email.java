/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.newemailadminstration;

import java.util.Scanner;

/**
 *
 * @author rootkali
 */
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity=500;
    private String email;
    private String name;
    private String alernateEmail;
    private String companysufix="com.madokasoftwares";

    public Email() {
        
        //call a method to get first name
        this.firstName=setFName();
        System.out.println("your firstname is "+this.firstName);
        //call a method to get lastname
         this.lastName=setLName();
        System.out.println("your lastname is "+this.lastName+"\n\n");

        
        //call a method to set the department
        this.department=setDept();
       // System.out.println("Department:"+this.department); //uncomment the lines and it will still work
        
        //call a method that returns a random password
        this.password=randompasword(8);
        //System.out.println("password:"+this.password);
        
        //combine elements to generate email
         email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+companysufix;
          // System.out.println("your email is  "+email);
    }
     
     //get the Lastname
    private String setFName(){
    System.out.println("Enter your firstName");
    Scanner in =new Scanner(System.in);
    String firstName= in.next();
        return firstName;
    }
    
      //get the firstName
    private String setLName(){    
    System.out.println("Enter you lastName");
     Scanner in =new Scanner(System.in);
    String lastName= in.next();
    return lastName;
    }
    
    
    //Ask for the department
    private  String setDept(){
        System.out.println("Enter your department\n1 for sales\n2 for development\n3 for Accounting\n0 for none\n Enter department code");
        Scanner in =new Scanner(System.in);
        int depChoice=in.nextInt();
        if(depChoice==1){
        return "sales";
        }else if(depChoice==2){
            return"dev";
    
    }else if(depChoice==3){
        return "accounting";
    }else if(depChoice==0){
        System.out.println("...........enter a valid department code........");
        in.nextInt();//System.exit(depChoice);
    }else{
       System.out.println("...........department code doesnt exsist enter a valid one........"); 
       in.nextInt();
    }
      
      return " ";
    
}
    //generat a random password
    private String randompasword(int length){
        
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456780!@#$%&*";
        
       char[]password=new char[length];
       for(int i=0;i<length;i++){
         int rand =(int) (Math.random()*passwordSet.length());
           password[i] = passwordSet.charAt(rand);
       }
    return new String(password) ;
    }
    
    //set the mailbox capacity
    public void setMaiCapacity(int capacity){
    this.mailboxCapacity=capacity;
    
    }
    //set alaernate email
    public void setAlernateemail(String altEmail){
    this.alernateEmail=altEmail;
    
    }
    //change password
    public void chnagepassword(String password){
    this.password=password;
    }
    public int getMailcapacity(){
    
    return mailboxCapacity;
    }
    
    public String getalernateEmail(){
    return alernateEmail;
    }
    public String getPassword(){
    return password;
    }
    
   
    public String showInfo(){
         
    return "YOUR PASSWORD is :"+password+
            "\nYOUR DEPARTMENT is :"+department+
            "\nYOUR NAMES ARE:" +firstName+" "+lastName+
            "\nCOMPANY EMAIL: "+email +
            "\nMAILBOX CAPACITY: "+mailboxCapacity+"mb";
    }
}
