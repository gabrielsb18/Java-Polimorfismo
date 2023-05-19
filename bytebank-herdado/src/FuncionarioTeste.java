public class FuncionarioTeste {
    public static void main(String[] args) {

        funcionario gabriel = new funcionario();
        gabriel.setNome("Gabriel Barbosa");
        gabriel.setCpf("222429000-3");
        gabriel.setSalario(2590.00);

        System.out.println(gabriel.getNome());
        System.out.println(gabriel.getBonificacao());
    }
}
