public class ImplementadorRemoto implements Implementador  {
     public void processarPedido(String produto, int quantidade) {
        System.out.println("Processando pedido remoto: " + produto +
         " - Quantidade: " + quantidade);
    }

}
