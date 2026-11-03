package restaurantefacade;

import pedido.GerenciadorPedidos;

public class RestauranteFacade {

    private GerenciadorPedidos gerenciadorPedidos = new GerenciadorPedidos();

    public Pedido criarPedido(String nomeCliente) {
        return gerenciadorPedidos.criarPedido(nomeCliente);
    }
}
