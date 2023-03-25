public class Calculadora {

    public Integer somar (Integer a, Integer b){
        return a + b;
    }

    public Integer subtrair(Integer a, Integer b) throws Exception {
        if (b > a){
            throw new Exception("Resultado não pode ser negativo.");
        }
        return a - b;
    }

    public Integer multiplicar(Integer a, Integer b) {
        return a * b;
    }

    public Integer dividir(Integer a, Integer b) {
        return a / b;
    }

}
