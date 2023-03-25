import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    // TDD: TEST DRIVEN DEVELOPMENT
    //Teste - Código - Refatora
    //RED - GREEN - REFACTOR

    static Calculadora calculadora;
    static Integer a;
    static Integer b;

    @BeforeAll
    public static void init() {
        calculadora = new Calculadora();
        a = 10;
        b = 5;
    }

    @Test
    public void deveSomarCorretamente() {
        //GIVEN

        //WHEN
        Integer resultado = calculadora.somar(a, b);

        //THEN
        Assertions.assertEquals(15, resultado);
    }

    @Test
    public void deveSubtrairCorretamente() throws Exception {
        //GIVEN

        //WHEN
        Integer resultado = calculadora.subtrair(a, b);

        //THEN
        Assertions.assertEquals(5, resultado);
    }

    @Test
    public void deveMultiplicarCorretamente() {
        //GIVEN

        //WHEN
        Integer resultado = calculadora.multiplicar(a, b);

        //THEN
        Assertions.assertEquals(50, resultado);
    }

    @Test
    public void deveDividirCorretamente() {
        //GIVEN
        Calculadora calculadora = new Calculadora();

        //WHEN
        Integer resultado = calculadora.dividir(a, b);

        //THEN
        Assertions.assertEquals(2, resultado);
    }

    @Test
    public void deveLancarExcecaoCasoValorDaSubSejaNeg() throws Exception {
        //GIVEN

        //WHEN
        Integer c = 5;
        Integer d = 10;

        //THEN
        Assertions.assertThrows(Exception.class, ()-> calculadora.subtrair(c,d));
    }

    @Test
    public void naoDividirPorZero(){
        //GIVEN

        //WHEN
        Integer c = 5;
        Integer d = 0;

        //THEN
        Assertions.assertThrows(ArithmeticException.class, ()-> calculadora.dividir(c,d));
    }

}
