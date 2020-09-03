package Interface;

public class Computer implements IButton {
    @Override
    public void volume() {
        System.out.println("Computer volume");
    }

    @Override
    public void freq() {
        System.out.println("Computer frequency");
    }
}
