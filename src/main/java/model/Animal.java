package model;

public abstract class Animal {

    protected String animalNoise;
    protected String habitat;
    protected String favoriteMeal;

    public Animal(){}

    public Animal(String animalNoise, String habitat, String favoriteMeal){
        this.animalNoise = animalNoise;
        this.habitat = habitat;
        this.favoriteMeal = favoriteMeal;
    }

    public String getAnimalNoise(){
        return animalNoise;
    }

    public String getHabitat(){
        return habitat;
    }

    public String getFavoriteMeal(){
        return favoriteMeal;
    }

}
