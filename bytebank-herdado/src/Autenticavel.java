public abstract class Autenticavel{      

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
}

//Interface não pode ter nada concreto

// "Interface" = é uma classe abstrata com todos os metodos abstratos

// F2 = Refactor name (multiple class function)