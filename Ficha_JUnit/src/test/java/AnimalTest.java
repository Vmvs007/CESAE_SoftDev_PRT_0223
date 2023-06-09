import Ex_03.Alimento;
import Ex_03.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    private Animal suricata;


    @BeforeEach
    public void setUp(){
        this.suricata= new Animal("Suricata", Alimento.FRUTAS);
    }

    @Test
    public void comerAlimentoValidoTest(){
        suricata.comer(Alimento.FRUTAS);
        assertFalse(suricata.estaComFome());
    }

    @Test
    public void comerAlimentoInvalidoTest(){
        suricata.comer(Alimento.CARNE);
        assertTrue(suricata.estaComFome());
    }

    @Test
    public void comerAlimentoNullTest(){
        suricata.comer(null);
        assertTrue(suricata.estaComFome());
    }
}
