public class Machine {

    //Attributes
    protected boolean isOn;

    //Methods
    public void power() {
        this.isOn =! this.isOn;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "isOn=" + isOn +
                '}';
    }
    /* GETTER, ikke nødvendig da vi bruger protected variabel.
    public boolean getIsOn(){
        return this.isOn;
    }
     */
}
