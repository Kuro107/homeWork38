import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Dog> dogs = new HashSet<>();

        for (int i = 0; i < 40; i++){
            dogs.add(new Dog(i+1,Breed.DALMATIAN,i+0.1));
        }
        for (Dog d: dogs) {
            System.out.println(d);

        }
    }
}
