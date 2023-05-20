public class Gerente extends funcionario { 
    
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){ // > Metodo e seus parametros
        if(this.senha == senha ) {
            return true;
        }else{
            return false;
        }
    }

    public double getBonificacao() { // Reescrita de codigo = redefinir o methodo na classe filha, utilizando a mesma assinatura;
        System.out.println("Chamando o método de bonificacao do GERENTE");
        return super.getSalario(); 

      // Removi a visualização de protected para privado, e ao invés de chamar meu methodo direto, chamei ele através do get, junto com nossa variavel "super" pra indicar que estamos chamando um atributo da classe mãe.

      // A palavra ou variavel "super" irá deixar claro que estamos buscando o atributo da classe mãe, ao invés do "this"
    }
}

// "extends" faz aproveitamento da classe funcionario não sendo mais necessario todos os gets e sets.

//  A classe gerente herdará todo o comportamento da classe funcionario. Isto é, ttodos os métodos públicos podem ser utilizados na classe Gerente também.

// obs : Ao estender a classe funcionario se diz que o Gerente é um funcionario.

// obs: Ao herdar, a classe filha ganha todas as características (atributos) e todas as funcionalidades (métodos) da classe mãe.

//beneficio principal : Reutilização do código.

// A classe o qual passa os atributos por meio da herança normalmente recebe o nome de classe mãe ou classe pai, assim como base class, ou super class.

//Neste caso a clase gerente é uma classe filha.

// Há alguns sinonimos o qual podemos utilizar, sendo: "gerente herda de funcionario" ou "gerente é um funcionario", como exemplo.

// Depois de criarmos esta classe que herdará os atributos da classe funcionario é hora de criarmos uma classe para teste e hora de chamarmos um objeto, sendo este "Gerente g1 = new Gerente()"

// O "g1" da nossa classe gerente faz parte da instancia que criamos, onde o g1 é a referencia do tipo funcionario.

// O nosso atributo especifico da classe gerente é uma funcionalidade, que atribuimos, sendo assim é um methodo.

// Algo interessante que eu acabei de descobrir: é possivel comentar multiplas linhas no vscode através do comando : shift+alt+A;