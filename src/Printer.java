public class Printer extends Machine {

    //Attributes
    private PaperTray paperTray;

    //Methods

    public Printer(PaperTray paperTray){
        //this.paperTray = new PaperTray();
        this.paperTray = paperTray; // dependency injection - aggregation
        this.paperTray.loadPaper(4);
    }

    public void print(String text, int amount){

        if (isOn == true && paperTray.display() >= amount){
            for(int i = 1 ; i <=amount; i++){
                System.out.println(text);
                paperTray.usePaper();
            }
        }else if(paperTray.display()<amount){
            System.out.println("You wish to print "+ amount + " pieces of paper, but there is only " + paperTray.display() + " left in the tray.");
            System.out.println("Try printing fewer pieces, or load more paper.");
        }
/*
        if(isOn == true){
            for(int i = 1 ; i <=amount; i++){
                if(paperTray.display() == 0){
                    System.out.println("Please load more paper.");
                    break;
                }
                System.out.println(text);
                paperTray.usePaper();
            }
        }

 */
    }

    @Override
    public String toString() {
        return "Printer{" +
                "isOn=" + isOn +
                '}';
    }
}
