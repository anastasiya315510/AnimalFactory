package AnimalFactory;
import com.github.rkumsher.collection.IterableUtils;

import static java.util.Arrays.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
// Классный код, Женя. У меня не получилась эта задача(((

public class AnimalFactory {
    List<Supplier<Animal>>animal = asList(Dog::new, Pig::new, Cat::new);
    Random ran = new Random();

    public Animal createRundomAnimal(){
        Integer i = ran.nextInt(animal.size());
        Supplier<Animal> animalSupplier = animal.get(i);
        return  animalSupplier.get();


    }

    public static void main(String[] args) {
        AnimalFactory af = new AnimalFactory();
        af.createRundomAnimal().makeVoice();
        af.createRundomAnimal().makeVoice();
        af.createRundomAnimal().makeVoice();
        af.createRundomAnimal().makeVoice();
        af.createRundomAnimal().makeVoice();




    }
}
