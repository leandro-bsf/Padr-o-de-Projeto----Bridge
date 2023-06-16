public class ImplementadorLocal implements Implementador{
    @Override
    public void processarPedido(String produto, int quantidade) {  
       System.out.println("Processando Pedido Local: " + produto + " - Quantidade: "+ quantidade);
    }
   
}
