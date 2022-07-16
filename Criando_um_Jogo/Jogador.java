public class Jogador {

    public static void main(String[] args) {

        Arma01 a1 = new Arma01(5, 10, "Arma1", true);
        a1.atirar();
        a1.recarregar();
        a1.silenciar();
        
        Arma02 a2 = new Arma02(15, 6, "Arma2", false);
        a2.atirar();
        a2.recarregar();
        a2.silenciar();

        Arma01 a3 = new Arma01(4, 30, "Arma3", true);
        a3.atirar();
        a3.recarregar();
        a3.silenciar();
        
    };




}