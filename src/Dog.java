public class Dog {
   private int name;
   private Breed breed;
   private double weight;

    public Dog(int name, Breed breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
    @Override
    public String toString(){
        return "My name is : " + name+
                " My breed is : " + breed+
                " My weight is : " + weight + "\n"
                + "____________________________________________________________";
    }
}
