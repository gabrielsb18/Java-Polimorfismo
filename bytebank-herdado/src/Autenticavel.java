//Contrato Autenticavel
    // quem assina esse contrato, precisa implementar 
        //metodo setSenha
        //metodo autentica

public abstract interface Autenticavel {      //retiramos o class por interface

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}

// A interface é uma alternativa a herança multipla, referente a o polimorfismo, não é para reutilização de codigo.

// Repetindo: O conceito principla do polimorfismo é a herança!

//Classes abstratas e intefaces não podem ser instanciadas.

//Não podemos dar new na classe abstrata, nem na interface!!

// Podemos imaginar a interface como um contrato que defini obrigações onde o cliente, no caso a classe herdada, deve cumprir com as obrigações, sendo elas os metodos, com sua respectiva implementação.

//Interface não pode ter nada concreto

// "Interface" = é uma classe abstrata com todos os metodos abstratos

// F2 = Refactor name (multiple class function)

// Com o "super" não estamos herdando nenhum metodo apenas deixando claro que estamos acessando um membro da classe mãe.