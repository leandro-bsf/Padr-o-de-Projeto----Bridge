public class PedidoRemoto extends Pedido {
        public PedidoRemoto(Implementador implementador) {
        super(implementador);  
    }
    @Override
    public void processar(String produto, int quantidade) {
        System.out.println("Processamento do pedido remoto:");
        implementador.processarPedido(produto, quantidade);
}
}