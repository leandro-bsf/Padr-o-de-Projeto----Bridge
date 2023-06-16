abstract class Pedido {
     protected  Implementador implementador;
 public Pedido (Implementador implementador){
 	this.implementador = implementador;}
    public abstract void processar(String produto, int quantidade);
}
