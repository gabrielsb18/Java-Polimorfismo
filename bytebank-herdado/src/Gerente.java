public class Gerente extends funcionario { 

// extends faz aproveitamento da classe funcionario não sendo mais necessario todos os gets e sets.

//  A classe gerente herdará todo o comportamento da classe funcionario. Isto é, ttodos os métodos públicos podem ser utilizados na classe Gerente também.

// obs : Ao estender a classe funcionario se diz que o Gerente é um funcionario.

    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha ) {
            return true;
        }else{
            return false;
        }
    }

//    public double getBonificacao() {
//        return this.salario;
//    }

}