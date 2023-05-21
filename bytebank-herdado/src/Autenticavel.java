public abstract interface Autenticavel{      //retiramos o class por interface

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}



//Interface não pode ter nada concreto

// "Interface" = é uma classe abstrata com todos os metodos abstratos

// F2 = Refactor name (multiple class function)