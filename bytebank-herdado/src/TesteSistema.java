public class TesteSistema {    
    public static void main(String [] args) {
        
        Gerente g = new Gerente();
        g.setSenha(2222);
        
        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente cliente = new Cliente();
        cliente.setSenha(8888);



        Sistemainterno si = new Sistemainterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);
 
    }

}

//Consegui atingir meu objetivo! Fiz com que meu Gerente e Cliente pudessem entrar no meu sistema sem que um atrapalhasse diretamente o outro. E isso só foi possivel com o uso de um contrato, no qual é chamando de "interface" e sua assinatura chamada "implements". 