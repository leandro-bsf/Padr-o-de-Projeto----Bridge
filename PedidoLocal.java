public class PedidoLocal  extends Pedido {
     public PedidoLocal(Implementador implementador) {
        super(implementador);
    }
    @Override
    public void processar(String produto, int quantidade) {
        System.out.println("Processamento do pedido local:");
        implementador.processarPedido(produto, quantidade);
    }}
