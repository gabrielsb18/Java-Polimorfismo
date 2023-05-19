public class TesteGerente {

    public static void main(String[] args) {
        Gerente g1 = new Gerente(); 
        g1.setNome("Madalena");
        g1.setCpf("37289745660");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(777);
        boolean autenticou = g1.autentica(777);

        System.out.println(autenticou);
    }
}
