import Ex_05.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    private Funcionario funcionario;

    @BeforeEach
    public void setUp(){
        this.funcionario= new Funcionario("Vitor",1000,"Formacao");
    }

    @Test
    public void aumentarSalarioTest(){
        // Salário começa a 1000
        assertEquals(1000,funcionario.getSalario(),"Salario deve começar a 1000");

        // Aumento o salário em 100%, deve passar para 2000
        funcionario.aumentarSalario(100);
        assertEquals(2000,funcionario.getSalario(),"Salario deve passar a 2000, dado o aumento de 100 porcento");

        // Aumento o salário em 10%, deve passar para 2200
        funcionario.aumentarSalario(10);
        assertEquals(2200,funcionario.getSalario(),"Salario deve passar a 2200, dado o aumento de 10 porcento");
    }

    @Test
    public void aumentarSalarioNegativoTest(){
        // Salário começa a 1000
        assertEquals(1000,funcionario.getSalario(),"Salario deve começar a 1000");


        //Diminuir o salário em 50%, não deve ser modificado (nao ha reducoes)
        assertThrows(IllegalArgumentException.class, () -> {
            funcionario.aumentarSalario(-50);
        });

        assertEquals(1000,funcionario.getSalario(),"Salario deve continuar a 1000");
    }

    @Test
    public void aumentarSalario0Test(){
        // Salário começa a 1000
        assertEquals(1000,funcionario.getSalario(),"Salario deve começar a 1000");


        // Tentar aumentar 0%, não deve ser modificado (nao ha aumentos nem reducoes)
        funcionario.aumentarSalario(0);
        assertEquals(1000,funcionario.getSalario(),"Salario deve continuar a 1000");
    }


}
