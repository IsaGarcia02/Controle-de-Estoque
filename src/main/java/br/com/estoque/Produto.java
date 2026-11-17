package  br.com.estoque;

/**
 * Um produto da loja e a quantidade dele em estoque.
 */

public class Produto {

    private final String nome;
    private int quantidade;

    public Produto(String nome, int quantidadeInicial) {
        if (quantidadeInicial < 0) {
            throw new IllegalArgumentException("A quantidade inicial não pode ser negativa.");
        }
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    /** Registra uma entrada: soma unidades ao estoque. */
    public void adicionar(int unidades) {
        validarUnidades(unidades);
        quantidade = quantidade + unidades;
    }

    /**
     * Registra uma saída: tira unidades do estoque.
     * Se pedir mais do que existe, recusa e NÃO altera a quantidade.
     */
    public void retirar(int unidades) {
        validarUnidades(unidades);
        if (unidades > quantidade) {
            throw new IllegalStateException(
                    "Saldo insuficiente: existem apenas " + quantidade + " unidade(s) de " + nome + ".");
        }
        quantidade = quantidade - unidades;
    }

    /** Consulta quantas unidades existem agora. */
    public int consultarSaldo() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    private void validarUnidades(int unidades) {
        if (unidades <= 0) {
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");
        }
    }
}