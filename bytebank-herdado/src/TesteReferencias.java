public abstract class TesteReferencias {
    public static void main ( String [] args) {

        Gerente g1= new Gerente();      // Crio um objeto 
        g1.setNome("Wanderson"); 
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);
        
        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());
    }

}

// O lado esquerdo podemos nos referir como uma parte mais especifica enquanto o direito um lado mais "generico".

// "funcionario e Gerente= tipo da referencia"

// Deu erro ao chamar nosso metodo autentica e inserir uma senha, mesmo sendo parte de um metodo da classe gerente, e isso ocorreu devido a nossa referencia, no caso g1 , que é do tipo funcionario , sendo assim, nosso compilador indica um erro, pois o metodo autentica não possui na classe funcionario apenas na classe Gerente.