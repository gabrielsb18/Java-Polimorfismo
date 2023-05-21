public class AutenticacaoUtil {
    
    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if(this.senha == senha ) {
            return true;
        } else {
            return false;
        }
    }

}

// A composiçao evita que eu reutilize codigo, ou seja, que eu repita uma implementação de um metodo pra outras classes, sendo necessario apenas a chamada da classe.
// "Composição" = um depende do outro . 