package Tasks;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("The gorilla is eating bananas.");
            return true;
        }
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("The gorilla is being groomed.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("You cautiously attempt to pet the gorilla.");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla myGorilla = new Gorilla();
        
        myGorilla.feed(true);
        myGorilla.groom();
        myGorilla.pet();
    }
}