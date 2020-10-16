package AnimalFactory;

public class Cat implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("May-may");
    }
}
