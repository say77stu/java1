package ru.progwards.java1.lessons.classes;

public class Cow extends Animal{
    public Cow(double weight) {
        super(weight);
    }

        @Override
        public Animal.AnimalKind getKind(){return Animal.AnimalKind.COW;}

        @Override
        public Animal.FoodKind getFoodKind(){return Animal.FoodKind.HAY;}

        @Override
        public double getFoodCoeff(){return 0.05;}


}
