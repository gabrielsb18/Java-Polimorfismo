public class TesteGerente {
    public static void main(String[] args) {

      Autenticavel referencia = new Cliente();

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

        System.out.println(g1.getBonificacao());
    }
}

// Pedi para o chat gpt explicar o porque de eu atribuir uma instancia ao valor de uma variavel.

//g1: g1 é o nome da variável que está sendo declarada para armazenar a referência ao objeto Gerente. Esse nome pode ser qualquer nome válido de variável em Java.

//new Gerente(): A expressão new Gerente() cria uma nova instância (ou objeto) da classe Gerente. Isso envolve a alocação de memória para o objeto e a execução do construtor da classe Gerente. O construtor é um método especial dentro da classe que é usado para inicializar o objeto. Neste caso, não foram fornecidos argumentos para o construtor, o que pode indicar que há um construtor padrão (sem argumentos) definido na classe Gerente.

//=: O operador = é usado para atribuir o valor à variável g1. Neste caso, o valor atribuído é a referência para o novo objeto Gerente criado.

//Em resumo, o código cria um novo objeto Gerente e o armazena na variável g1, permitindo que você acesse e manipule esse objeto posteriormente no seu programa. (Chat gpt)