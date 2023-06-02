package Ex_02;

public class Rua {
    public static void main(String[] args) {
        Carro carro = new Carro("Mercedes",2022);
        Mota mota = new Mota("BMW", 2019);

        carro.acelerar();
        carro.travar();
        carro.transportar();

        System.out.println("____________________-");

        mota.acelerar();
        mota.travar();
        mota.transportar();
    }
}
