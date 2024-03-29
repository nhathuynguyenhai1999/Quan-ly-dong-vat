package animal;
import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import animal.edible.Edible;

public class AbstractAndInterfaceTest {
    public static void main(String[] ars){
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(((Chicken) edibler).howToEat());
            }
        }
    }
}
