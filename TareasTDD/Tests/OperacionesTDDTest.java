import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    void Devuelve0(){
        //arrange (set up)
        OperacionesTDD prueba1 = new OperacionesTDD();
        //action
        String cocheRojo = prueba1.calculos(0);
        //assert
        assertEquals("0", cocheRojo);
        System.out.println("Test con 0 ejecutado correctamente");
    }
    @Test
    void Devuelve1(){
        //arrange (set up)
        OperacionesTDD prueba1 = new OperacionesTDD();
        //action
        String cocheRojo = prueba1.calculos(1);
        //assert
        assertEquals("1", cocheRojo);
        System.out.println("Test con 1 ejecutado correctamente");
    }
}