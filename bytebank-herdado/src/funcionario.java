public class funcionario {
    
    private String nome;
    private String cpf;
    protected double salario;

    public double getBonificacao() {
        return this.salario*0.5;
    }

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

// Atributo privado : modificador de visibilidade = visivel somente nesta classe.

// Atributo protected: publico(visivel) para as classes filhas, que herdam os atributos . O "protected está entre o publico e privado". Irá ser privado para as outras classes.

// O protected foi feito para liberar o acesso ao atributo para os filhos, e deixar privado para todas as outras classes. Ou seja, quem não é um Funcionario não verá o salario.

// De outra maneira: atributos e métodos protected podem ser visto pelas próprias classes e suas filhas... Porém, com private apenas a própria classe enxerga os atributos/métodos.