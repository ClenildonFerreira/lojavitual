package br.edu.fadam.lojavitual;

import br.edu.fadam.lojavitual.dao.CarrinhoDeComprasDao;
import br.edu.fadam.lojavitual.modelo.Produto;
import br.edu.fadam.lojavitual.modelo.CarrinhoDeCompra;


public class Main {

	public static void main(String[] args) {
		
		Produto sapatoNike = new Produto();
		sapatoNike.setNome("Air Force Utility");

		Produto celularDeEntrada = new Produto();
		celularDeEntrada.setNome("HOMTOM S8");

		Produto smartTv50pol = new Produto();
		smartTv50pol.setNome("Smart TV LED 50 UHD 4K''");

		CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
		carrinhoDeCompra.setId(10l);
		carrinhoDeCompra.setCodigo("BZMGFFBDJHD300");
		carrinhoDeCompra.addItem(sapatoNike, 6);
		carrinhoDeCompra.addItem(celularDeEntrada, 9);

		CarrinhoDeCompra carrinho2 = new CarrinhoDeCompra();
		carrinho2.setId(20l);
		carrinho2.setCodigo("HHSJHDKSFKH200");
		carrinho2.addItem(celularDeEntrada, 10);


		CarrinhoDeComprasDao ccd = new CarrinhoDeComprasDao();
		ccd.inserir(carrinhoDeCompra);
		ccd.inserir(carrinho2);
		
		CarrinhoDeCompra carrinhoBuscadoNaMemoria20 = ccd.buscarPorId(10l);
		carrinhoBuscadoNaMemoria20.imprimirDadosCarrinho();
	}

}
