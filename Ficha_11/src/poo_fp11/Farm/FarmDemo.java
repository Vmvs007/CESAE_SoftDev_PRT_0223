package poo_fp11.Farm;

import java.util.ArrayList;

public class FarmDemo {

    public static void main(String[] args) {

        ArrayList<Animal> animaisDaQuinta = new ArrayList<Animal>();

        animaisDaQuinta.add(new Cao());
        animaisDaQuinta.add(new Galinha());
        animaisDaQuinta.add(new Vaca());
        animaisDaQuinta.add(new Cao());
        animaisDaQuinta.add(new Gato());
        animaisDaQuinta.add(new Porco());
        animaisDaQuinta.add(new Pato());

        Farm quinta = new Farm(animaisDaQuinta);
        quinta.makeNoise();
    }
}
