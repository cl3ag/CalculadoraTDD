import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    void Devuelve0(){
        //arrange (set up)
        //action
        String cocheRojo = OperacionesTDD.suma("");
        //assert
        assertEquals("0", cocheRojo);
        System.out.println("Test con 0 ejecutado correctamente");
    }
    @Test
    void Devuelve1(){
        //arrange (set up)
        //action
        String cocheRojo = OperacionesTDD.suma("1");
        //assert
        assertEquals("1", cocheRojo);
        System.out.println("Test con 1 ejecutado correctamente");
    }
    @Test
    void Devuelve3(){
        //arrange (set up)
        //action
        String cocheRojo = OperacionesTDD.suma("1,2");
        //assert
        assertEquals("3", cocheRojo);
        System.out.println("Test con 3 ejecutado correctamente");
    }
    @Test
    void Devuelve4(){
        //arrange (set up)
        //action
        String cocheRojo = OperacionesTDD.suma("1,1,2");
        //assert
        assertEquals("4", cocheRojo);
        System.out.println("Test con 4 ejecutado correctamente");
    }
    @Test
    void DevuelveError(){
        //arrange (set up)
        //action
        String cocheRojo = OperacionesTDD.suma("1,1,2,");
        //assert
        assertEquals("-1", cocheRojo);
        System.out.println("Test con , al final fallido correctamente");
    }
    @Test
    void TestConNegativo(){
        //arrange (set up)
        //action
        String cocheRojo = OperacionesTDD.suma("1,1,-2");
        //assert
        assertEquals("Numero negativos no permitidos", cocheRojo);
        System.out.println("Test con numero negativo fallido correctamente");
    }
}