package Interface;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IButton radio = new Radio();
        IButton computer = new Computer();

        List<IButton> iButtons = new ArrayList<>();
        iButtons.add(radio);
        iButtons.add(computer);

        for(IButton b : iButtons){
            b.freq();
            b.volume();
        }
    }
}

