public class main {
    public static void main(String[] args) {
        Implementador implementadorLocal = new ImplementadorLocal();
        Implementador implementadorRemoto = new ImplementadorRemoto();
        Pedido pedidoLocal = new PedidoLocal(implementadorLocal);
        Pedido pedidoRemoto = new PedidoRemoto(implementadorRemoto);
        pedidoLocal.processar("Coca-colca", 5);
        pedidoRemoto.processar("Pão de queijo", 10);    
    }}
