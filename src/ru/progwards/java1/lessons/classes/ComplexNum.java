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
     //    сложение комплексных чисел по формуле: (a + bi) + (c + di) = (a + c) + (b + d)i;
       int resA1, resB1;
       ComplexNum complexNum1 = new ComplexNum(this.a, this.b);
       ComplexNum complexNum2 = new ComplexNum(num.a, num.b);
       resA1 = complexNum1.a + complexNum2.a;
       resB1 = complexNum1.b + complexNum2.b;
       ComplexNum resAdd = new ComplexNum(resA1, resB1);
       return resAdd;
       }

    public ComplexNum sub(ComplexNum num) {
        //  вычитание комплексных чисел по формуле: (a + bi) - (c + di) = (a - c) + (b - d)i
        int resA1, resB1;
        ComplexNum complexNum1 = new ComplexNum(this.a, this.b);
        ComplexNum complexNum2 = new ComplexNum(num.a, num.b);
        resA1 = complexNum1.a - complexNum2.a;
        resB1 = complexNum1.b - complexNum2.b;
        ComplexNum resSub = new ComplexNum(resA1, resB1);
        return resSub;
       }

    public ComplexNum mul(ComplexNum num){
        // умножение комплексных чисел по формуле: (a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
        int resA1, resB1;
        ComplexNum complexNum1 = new ComplexNum(this.a, this.b);
        ComplexNum complexNum2 = new ComplexNum(num.a, num.b);
        resA1 = complexNum1.a * complexNum2.a - complexNum1.b*complexNum2.b; // вычисление действительной части при умножении
        resB1 = complexNum1.b * complexNum2.a + complexNum1.a*complexNum2.b; // вычисление мнимой части при умножении
        ComplexNum resMult = new ComplexNum(resA1, resB1);
        return resMult;
    }

    public ComplexNum div(ComplexNum num){
        // деление комплексных чисел по формуле:
        //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
        int resA1, resB1;
        ComplexNum complexNum1 = new ComplexNum(this.a, this.b);
        ComplexNum complexNum2 = new ComplexNum(num.a, num.b);
        resA1 = (complexNum1.a * complexNum2.a + complexNum1.b*complexNum2.b)/(complexNum2.a*complexNum2.a+complexNum2.b*complexNum2.b); // вычисление действительной части при делении
        resB1 = (complexNum1.b * complexNum2.a - complexNum1.a*complexNum2.b)/(complexNum2.a*complexNum2.a+complexNum2.b*complexNum2.b); // вычисление мнимой части при делении
        ComplexNum resDiv = new ComplexNum(resA1, resB1);
        return resDiv;
    }

    public static void main(String[] args) {


      //  System.out.println(resAdd);
    }

}
