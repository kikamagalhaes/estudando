
public abstract class Arma {

//ATRIBUTOS
public int municaoTiro;
public int tempoRecarga;
public String marcaArma;
public boolean silenciador;


//MÉTODOS

public void atirar() {
    System.out.println("");
    System.out.println("---------------------------------------------------------");
    System.out.println("");
    System.out.println("Eu sou uma " + marcaArma + " e estou dando " + municaoTiro + " tiros!");

};

public void recarregar() {

    System.out.println("Aguarde " + tempoRecarga + " segundos para recarregar!!");

};

public void silenciar() {
if(silenciador){
    System.out.println("Eu tenho silenciador.");
    System.out.println("");
} else {

    System.out.println("Eu não tenho silenciador");
    System.out.println("");
}


}
}