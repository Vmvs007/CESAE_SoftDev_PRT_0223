package poo_fp11.Farm;

import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> animais;

    public Farm(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    public void makeNoise(){
        for(Animal animal : this.animais){
            animal.fazerBarulho();
        }
    }
}
