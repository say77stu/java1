package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    public int a, b;
    //public char i;
       public ComplexNum(int a, int b){
       this.a=a;
       this.b=b;

    //    String z = Integer.toString(a) + Integer.toString(b)+"*i";

    }
    @Override
    public String toString(){
        this.a=a;
        this.b=b;
        return a+"+"+b+"*i";
    }
   public ComplexNum add(ComplexNum num){
     //   (a + bi) + (c + di) = (a + c) + (b + d)i;
       int resA1, resB1;
       ComplexNum complexNum1 = new ComplexNum(this.a, this.b);
       ComplexNum complexNum2 = new ComplexNum(num.a, num.b);
       resA1 = complexNum1.a + complexNum2.a;
       resB1 = complexNum1.b + complexNum2.b;
       ComplexNum resAdd = new ComplexNum(resA1, resB1);
       return resAdd;
       }

    public static void main(String[] args) {


      //  System.out.println(resAdd);
    }

}
