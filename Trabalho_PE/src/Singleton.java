public class Singleton {

    private Singleton instance;
    private String atributo_1;
    private int atributo_2;

    private Singleton(String atributo_1) {
        this.atributo_1 = atributo_1;
    }

    public Singleton getInstance(String atributo_1){
        if(instance!=null){
            return instance;
        }
            return instance=new Singleton(atributo_1);

    }

}

