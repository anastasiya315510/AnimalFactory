package AnimalFactory;

public class Dog implements Animal {
    @Override
    public void makeVoice() {
        System.out.println("Gav-gav");
    }
}
