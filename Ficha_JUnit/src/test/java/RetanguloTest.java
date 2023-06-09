import Ex_04.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    private Retangulo retangulo;

    @BeforeEach
    public void setUp(){
        this.retangulo= new Retangulo(10,5);
    }

    @Test
    public void calcularPerimetroTest(){
        assertEquals(30, retangulo.calcularPerimetro(), "O perímetro de um retangulo 10x5 tem de ser 30");
    }

    @Test
    public void calcularAreaTest(){
        assertEquals(50, retangulo.calcularArea(), "A area de um retangulo 10x5 tem de ser 50");
    }

    // Casos de teste mais específicos

    @Test
    public void calcularPerimetroNegativoOu0Test(){
        this.retangulo = new Retangulo(0,10);
        assertThrows(IllegalArgumentException.class, () -> {
            retangulo.calcularPerimetro();
        });

        this.retangulo = new Retangulo(-10,10);
        assertThrows(IllegalArgumentException.class, () -> {
            retangulo.calcularPerimetro();
        });

        this.retangulo = new Retangulo(-10,-10);
        assertThrows(IllegalArgumentException.class, () -> {
            retangulo.calcularPerimetro();
        });
    }

    @Test
    public void calcularAreaNegativoOu0Test(){
        this.retangulo = new Retangulo(0,10);
        assertThrows(IllegalArgumentException.class, () -> {
            retangulo.calcularArea();
        });

        this.retangulo = new Retangulo(-10,10);
        assertThrows(IllegalArgumentException.class, () -> {
            retangulo.calcularArea();
        });

        this.retangulo = new Retangulo(-10,-10);
        assertThrows(IllegalArgumentException.class, () -> {
            retangulo.calcularArea();
        });
    }
}
