//Gerente eh um funcionario, Gerente herda da Class funcionario, assina o contrato Autenticavel, é um autenticavel
public class Gerente extends funcionario implements Autenticavel{
    
    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }
/*     private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){ // > Metodo e seus parametros
        if(this.senha == senha ) {
            return true;
        }else{
            return false;
        }
    } */

    public double getBonificacao() { // Reescrita de codigo = redefinir o methodo na classe filha, utilizando a mesma assinatura;
        System.out.println("Chamando o método de bonificacao do GERENTE");
        return super.getSalario(); 

      // Removi a visualização de protected para privado, e ao invés de chamar meu methodo direto, chamei ele através do get, junto com nossa variavel "super" pra indicar que estamos chamando um atributo da classe mãe.

      // A palavra ou variavel "super" irá deixar claro que estamos buscando o atributo da classe mãe, ao invés do "this"
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
}

//Mesmo com o uso de interface foi perceptivel a repetição de codigo, no caso, as minhas implementações em cada tipo de funcionario diferente. Pórem creio que podemos resolver iss  .

//Em um sistema eu posso "assinanar (implements)", vários contratos.

//O Java não permite fazer herança multipla de classes!! Diferente de outras linguagens como c++ e python :(

//"Herança multipla" = extendemos nossa classe para duas classes mães. Até então estava usando apenas a classe simples.

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