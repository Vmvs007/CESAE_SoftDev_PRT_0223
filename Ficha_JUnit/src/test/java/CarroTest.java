import Ex_06.Carro;
import Ex_06.TipoCombustivel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    public void testGetIdade() {
        Carro carro = new Carro("Marca", "Modelo", 2010, 150, 2000, TipoCombustivel.GASOLINA, 7.5);
        assertEquals(13, carro.getIdade());
    }

    @Test
    public void testLigarCarroMaisDe30AnosDiesel() {
        Carro carro = new Carro("Marca", "Modelo", 1910, 150, 2000, TipoCombustivel.DIESEL, 7.5);
        assertEquals("Deita um pouco de fumo... Custa a pegar... O carro esta ligado!\nVrum-vrum-vrum", carro.ligar());
    }

    @Test
    public void testLigarCarroMaisDe30AnosGasolina() {
        Carro carro = new Carro("Marca", "Modelo", 1910, 150, 2000, TipoCombustivel.GASOLINA, 7.5);
        assertEquals("Custa a pegar... O carro esta ligado!\nVrum-vrum-vrum",carro.ligar());
    }

    @Test
    public void testLigarCarroCom30AnosPotenciaBaixa() {
        Carro carro = new Carro("Marca", "Modelo", 1993, 50, 2000, TipoCombustivel.GASOLINA, 7.5);
        assertEquals("Vruummmmmmm",carro.ligar());
    }

    @Test
    public void testLigarCarroCom30AnosPotenciaLimite() {
        Carro carro = new Carro("Marca", "Modelo", 1993, 250, 2000, TipoCombustivel.GASOLINA, 7.5);
        assertEquals("VRUUMMMMMM",carro.ligar());
    }

    @Test
    public void testLigarCarroCom30AnosPotenciaAlta() {
        Carro carro = new Carro("Marca", "Modelo", 1993, 900, 2000, TipoCombustivel.GASOLINA, 7.5);
        assertEquals("VRUUMMMMMM",carro.ligar());
    }

    @Test
    public void testLigarCarroMenosDe30AnosPotenciaBaixa() {
        Carro carro = new Carro("Marca", "Modelo", 2022, 50, 2000, TipoCombustivel.DIESEL, 7.5);
        assertEquals("Vruummmmmmm",carro.ligar());
    }

    @Test
    public void testLigarCarroMenosDe30AnosPotenciaLimite() {
        Carro carro = new Carro("Marca", "Modelo", 2022, 250, 2000, TipoCombustivel.DIESEL, 7.5);
        assertEquals("VRUUMMMMMM",carro.ligar());
        // Testar se liga bem
    }

    @Test
    public void testLigarCarroMenosDe30AnosPotenciaAlta() {
        Carro carro = new Carro("Marca", "Modelo", 2022, 900, 2000, TipoCombustivel.DIESEL, 7.5);
        assertEquals("VRUUMMMMMM",carro.ligar());
        // Testar se liga bem
    }

    @Test
    public void testCorridaCarroVencedorIdade() {
        Carro carro1= new Carro("Marca", "Modelo", 2023,250,2000,TipoCombustivel.GASOLINA,10);
        Carro carro2= new Carro("Marca", "Modelo", 2020,250,2000,TipoCombustivel.GASOLINA,10);

        assertEquals(carro1,carro1.corrida(carro2));
    }

    @Test
    public void testCorridaCarroVencedorCilindrada() {
        Carro carro1= new Carro("Marca", "Modelo", 2020,250,2500,TipoCombustivel.GASOLINA,10);
        Carro carro2= new Carro("Marca", "Modelo", 2020,250,2000,TipoCombustivel.GASOLINA,10);

        assertEquals(carro1,carro1.corrida(carro2));
    }

    @Test
    public void testCorridaCarroVencedorPotencia() {
        Carro carro1= new Carro("Marca", "Modelo", 2020,900,2000,TipoCombustivel.GASOLINA,10);
        Carro carro2= new Carro("Marca", "Modelo", 2020,250,2000,TipoCombustivel.GASOLINA,10);

        assertEquals(carro1,carro1.corrida(carro2));
    }

    @Test
    public void testCorridaCarroPerdeIdade() {
        Carro carro1= new Carro("Marca", "Modelo", 2020,250,2000,TipoCombustivel.GASOLINA,10);
        Carro carro2= new Carro("Marca", "Modelo", 2023,250,2000,TipoCombustivel.GASOLINA,10);

        assertEquals(carro2,carro1.corrida(carro2));
    }

    @Test
    public void testCorridaCarroPerdeCilindrada() {
        Carro carro1= new Carro("Marca", "Modelo", 2020,250,2000,TipoCombustivel.GASOLINA,10);
        Carro carro2= new Carro("Marca", "Modelo", 2020,250,2500,TipoCombustivel.GASOLINA,10);

        assertEquals(carro2,carro1.corrida(carro2));
    }

    @Test
    public void testCorridaCarroPerdePotencia() {
        Carro carro1= new Carro("Marca", "Modelo", 2020,250,2000,TipoCombustivel.GASOLINA,10);
        Carro carro2= new Carro("Marca", "Modelo", 2020,900,2000,TipoCombustivel.GASOLINA,10);

        assertEquals(carro2,carro1.corrida(carro2));
    }

    @Test
    public void testCorridaEmpate() {
        Carro carro1= new Carro("Marca", "Modelo", 2020,250,2000,TipoCombustivel.GASOLINA,10);
        Carro carro2= new Carro("Marca", "Modelo", 2020,250,2000,TipoCombustivel.GASOLINA,10);

        assertNull(carro1.corrida(carro2));
    }

    @Test
    public void testCalcularConsumo() {
        Carro carro = new Carro("Marca", "Modelo", 2010, 150, 2000, TipoCombustivel.GASOLINA, 7.5);
        assertEquals(7.5, carro.calcularConsumo(100.0));
    }


}
