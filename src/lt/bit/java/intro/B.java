package lt.bit.java.intro;

import java.awt.*;

public class B {
    private static Robot r1, r2;{



    }

    public static void main(String[] args) {
        System.out.println("yes");
         class Robot {
             String name;
             String color;
             int weight;

             Robot(String n, String c, int w) {
                 this.name = n;
                 this.color = c;
                 this.weight = w;

             }



             Robot r1 =new Robot("Tom","red", 30);
             Robot r2 =new Robot("Jerry","blue",40);

           //  r1.itroduceSelf(public Robot);
           //  r2.itroduceSelf(public Robot);

             void introduceSelf(){
                 System.out.println("My name is " + this.name);
             }

         }
         class Person {
             String name;
             String personality;
             boolean isSitting;
             Robot robotOwned;

             Person(String n,String p,boolean i){
                 this.name =n;
                 this.personality =p;
                 this.isSitting =i;
             }
             public void sitDown(){
                 this.isSitting = true; }
             public void standUp(){
                 this.isSitting = false; }
         }
         Person p1 = new Person("Alice","aggressive",false);
         Person p2 = new Person("Becky","talkative",true);

        // p1.robotOwned = r2;
        // p2.robotOwned = r1;

         p1.robotOwned.introduceSelf();
         p2.robotOwned.introduceSelf();
    }
}
