package Interface;

public class Radio implements IButton {
    @Override
    public void volume() {
        System.out.println("Volume button");
    }

    @Override
    public void freq() {
        System.out.println("Frequency button");
    }
}
