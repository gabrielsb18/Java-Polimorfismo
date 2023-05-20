// Não posso instanciar objetos dessa classe, pq é abstrata
public abstract class funcionario {
    
    private String nome;
    private String cpf;
    private double salario; // O ideal é deixar sempre nosso methodo privado!

    public abstract double getBonificacao(); // Abstract no methodo significa que não há nehuma implementação no meu código, o mesmo que methodo sem corpo. Devido a isso os filhos, ou seja as classes (filhas), precisam implementa o nosso metodo, dando vida a ele, tornando algo que antes era opcional, obrigatorio, caso contrário não irá compilar.

    //De forma alguma um methodo abstrato da classe mãe pode ter uma implementação,apenas na concreta (filhas).

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

}

//um método abstrato define apenas a assinatura (visibilidade, retorno, nome do método e parâmetros.

//Na classe, o "abstract" significa que não será possível instanciar nenhum objeto daquele tipo, enquanto que para o método, indica que ele não tem implementação, e o primeiro filho concreto precisará implementá-lo. (alura)

// Porque tornamos uma classe abstrata? R : Para que algo generico evite de ser instaciado.

// Uma classe abstrata representa um conceito, algo abstrato, e o compilador não permite instanciar um objeto dessa classe. Para instanciar é preciso criar primeiro uma classe filha não abstrata. (Alura)

//O "abstract" antes do class, utizamos para uma classe base(mãe), desta maneira dizemos que a classe funcionario é um conceito, enquanto as classes subsequentes(filhas = Gerente, Editor, Designer) são concretas.

// O primeiro Pilar da herança é a reutilização.

// Atributo privado : modificador de visibilidade = visivel somente nesta classe.

// Atributo protected: publico(visivel) para as classes filhas, que herdam os atributos . O "protected está entre o publico e privado". Irá ser privado para as outras classes.

// O protected foi feito para liberar o acesso ao atributo para os filhos, e deixar privado para todas as outras classes. Ou seja, quem não é um Funcionario não verá o salario.

// De outra maneira: atributos e métodos protected podem ser visto pelas próprias classes e suas filhas... Porém, com private apenas a própria classe enxerga os atributos/métodos.