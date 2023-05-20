public class ControleBonificacao {
    
    private double soma;

        public void registra (funcionario f) {
            double boni = f.getBonificacao();
            this.soma = this.soma + boni;
        }

        public double getSoma() {
            return soma;
        }

}

//Polimorfismo : "referências de tipos de classes mais genéricas referenciem objetos mais específicos" (alura).

//Obs: O tipo do objeto não pode mudar e sim sua referencia, indo de uma mais especifica pra uma generica, como no nosso exemplo a classe funcionario que aponta para a classe especifica gerente ou editor, assim por diante. É AQUI ONDE ENTRA O POLIMORFISMO!! O polimorfismo permite usar referências mais genéricas para a comunicação com um objeto.

//o uso de referências mais genéricas permite desacoplar um sistema.

// O polimorfismo permite nós a criarmos um metodo generico onde não precisamos mais criar um metodo especifico pra cada tipo de funcionario, no nosso exemplo,  que ainda sim irá chamar o metodo especifico definido em sua respectiva classe.