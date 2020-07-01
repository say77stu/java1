package ru.progwards.java1.lessons.classes;

public class Animal {
   // private static double getFoodCoef;
    public final double weight;

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
    enum FoodKind {UNKNOWN, HAY, CORN}

    public Animal(double weight){
     this.weight=weight;
    }
    public AnimalKind getKind() { return AnimalKind.ANIMAL;}
    public FoodKind getFoodKind() {return FoodKind.UNKNOWN;}
    @Override
    public String toString(){return "I am "+this.getKind()+", eat "+ this.getFoodKind();}

    public double getWeight() {
        double weight = this.weight;
        return weight;
    }

    public double getFoodCoeff(){
        return 0.02;
        }

    public double calculateFoodWeight(){
        double weight = this.weight;
        double getFoodCo = this.getFoodCoeff();
        return getFoodCo*weight;}

        public String toStringFull(){return "I am "+this.getKind()+", eat "+ this.getFoodKind()+" "+this.calculateFoodWeight();}

    public static void main(String[] args) {
        Animal animal1 =new Animal(100.0);
        Animal cow1=new Cow(50.0);
        Animal duck1=new Duck(20.0);
        System.out.println(animal1);
        System.out.println(cow1);
        System.out.println(duck1);
        System.out.println(animal1.toStringFull());

    }
}

