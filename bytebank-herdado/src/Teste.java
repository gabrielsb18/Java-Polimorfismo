public class Teste {
    public static void main(String[] args) {

        TesteFuncionario f1 = new TesteFuncionario();

        f1.setSalario(3000.0);
        System.out.println(f1.getTipo());
        System.out.println(f1.getBonificacao());

        TesteFuncionario f2 = new TesteFuncionario();
        f2.setTipo(1);
        f2.setSalario(5000.0);
        System.out.println(f2.getTipo());
        System.out.println(f2.getBonificacao());
    }
}