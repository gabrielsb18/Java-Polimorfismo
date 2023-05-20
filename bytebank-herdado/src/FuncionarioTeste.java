public class FuncionarioTeste {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Gerente gabriel = new Gerente();
        gabriel.setNome("Gabriel Barbosa");
        gabriel.setCpf("222429000-3");
        gabriel.setSalario(2600.00);

        System.out.println(gabriel.getNome());
        System.out.println(gabriel.getBonificacao());

       // gabriel.salario = 300.0;
    }
}
