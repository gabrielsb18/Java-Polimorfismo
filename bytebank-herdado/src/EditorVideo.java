public class EditorVideo extends funcionario { 

    public double getBonificacao() {
        System.out.println("Chamando o metodo de bonificacao do EDITOR DE VIDEO");
        return super.getBonificacao() + 100;

    }
}



