package ru.progwards.java1.lessons.classes;

public class Animal {
    private static double getFoodCoef;
    public final double weight;

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK}
    enum FoodKind {UNKNOWN, HAY, CORN}

    public Animal(double weight){
     this.weight=weight;
    }
    public AnimalKind getKind() { return AnimalKind.ANIMAL;}
    public FoodKind getFoodKind() {return FoodKind.UNKNOWN;}
    public String toString(){return "I am <AnimalKind>, eat <FoodKind>";}

    public double getWeight() {
        double weight = this.weight;
        return weight;
    }

    public double getFoodCoeff(){
        getFoodCoef = 0.02;
        return getFoodCoef;
        }

    public double calculateFoodWeight(){
        double weight = this.weight;
        return Animal.getFoodCoef*weight;}

    public String toStringFull(){return "I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>";}

    public static void main(String[] args) {
        Animal cow1=new Animal(50.0);
        System.out.println(cow1);
    }
}

