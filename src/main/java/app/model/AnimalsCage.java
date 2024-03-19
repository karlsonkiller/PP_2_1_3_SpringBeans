package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animal,
                       @Qualifier("dog") Animal animal2,
                       Timer timer) {
        this.animal = animal;
        this.animal2 = animal2;
        this.timer = timer;
    }


    @Qualifier("cat")
    @Autowired
    private Animal animal;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    @Qualifier("dog")
    @Autowired
    private Animal animal2;

    public void animalSay() {
        System.out.println("Say:");
        System.out.println(animal2.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    private final Timer timer;

    public Timer getTimer () {
       return timer;
    }


}
