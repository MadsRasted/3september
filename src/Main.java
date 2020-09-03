import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        PaperTray paperTray = new PaperTray();
        /*
        InkJet inkJet = new InkJet(paperTray);
        inkJet.print("Hejsa", 2);
        LaserPrint laserPrint = new LaserPrint(paperTray);
        laserPrint.print("hej", 1);
        */
        List<Printer> printers = new ArrayList<>();
        printers.add(new InkJet(paperTray));
        printers.add(new LaserPrint(paperTray));
        printers.add(new LaserPrint(paperTray));
        printers.add(new LaserPrint(paperTray));
        printers.add(new Printer(paperTray));

        for (Printer pr : printers){
            pr.print("jjj", 2);
        }
    }
}
