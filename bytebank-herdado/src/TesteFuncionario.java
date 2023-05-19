public class TesteFuncionario {
    
    private String nome;
    private String cpf;
    private double salario;
    private int tipo = 0; // - Funcionario comum, 1- Gerente, 2-Diretor

    public double getBonificacao() {
        
        if(this.tipo == 0) { // Funcionario comumn
            return this.salario*0.1;
        } else if(this.tipo == 1) { // Gerente
            return this.salario;
        } else { // Diretor 
            return this.salario + 1000.0; // !Code smell - codigo que não é prático, ex : muitos ifs 
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
    this.tipo = tipo;
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












































