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

//

// O polimorfismo permite nós a criarmos um metodo generico onde não precisamos mais criar um metodo especifico pra cada tipo de funcionario, no nosso exemplo,  que ainda sim irá chamar o metodo especifico definido em sua respectiva classe.