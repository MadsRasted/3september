public class PaperTray {

    private int paper;


    public int getPaper() {
        return paper;
    }

    public boolean usePaper() {
        this.paper--;
        return true;
    }

    public void loadPaper(int amount){
        this.paper = this.paper + amount;
    }

    public int display(){
        return this.paper;
    }
}
