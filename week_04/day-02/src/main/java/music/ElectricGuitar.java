package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar() {
        super();
        setNumberOfStrings(6);
    }

    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
    }


    @Override
    public String sound() {
        return "Twang";
    }

    @Override
    public void play() {
        System.out.println("Electric Guitar, a " + numberOfStrings +
                "-stringed instrument that goes " + sound() + ".");
    }
}
