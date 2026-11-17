package br.com.estoque;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ProdutoTest {

    @Test
    @DisplayName("Entrada: adicionar unidades aumenta o saldo")
    void deveAdicionarUnidadesAoSaldo() {
        Produto produto = new Produto("Caneta", 10);

        produto.adicionar(5);

        assertEquals(15, produto.consultarSaldo());
    }

    @Test
    @DisplayName("Saída com saldo suficiente: retirar diminui o saldo")
    void deveRetirarQuandoHaSaldoSuficiente() {
        Produto produto = new Produto("Caneta", 10);

        produto.retirar(4);

        assertEquals(6, produto.consultarSaldo());
    }

    @Test
    @DisplayName("Saída com saldo insuficiente: retirada é recusada e o saldo não muda")
    void deveRecusarRetiradaMaiorQueOSaldo() {
        Produto produto = new Produto("Caneta", 10);

        assertThrows(IllegalStateException.class, () -> produto.retirar(15));

        assertEquals(10, produto.consultarSaldo());
    }

    @Test
    @DisplayName("Extra: quantidade zero ou negativa é recusada")
    void deveRecusarQuantidadeZeroOuNegativa() {
        Produto produto = new Produto("Caneta", 10);

        assertThrows(IllegalArgumentException.class, () -> produto.adicionar(0));
        assertThrows(IllegalArgumentException.class, () -> produto.retirar(-3));
        assertThrows(IllegalArgumentException.class, () -> new Produto("Lápis", -1));

        assertEquals(10, produto.consultarSaldo());
    }
}