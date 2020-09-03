public class LaserPrint extends Printer{


    public LaserPrint(PaperTray paperTray) {
        super(paperTray);
    }

    @Override
    public void print(String text, int amount) {
        System.out.println("I am a Laser printer.");
    }
}
