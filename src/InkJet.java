public class InkJet extends Printer{

    //Constructor
    public InkJet(PaperTray paperTray) {
        super(paperTray);
    }

    //Attributes


    //Methods
    @Override
    public void print(String text, int amount){
        //super.print(" ", 0);
        System.out.println("I am an InkJet");
    }
}
