package com.documentacao;

/**
 * <p>Representa o conceito geral de uma casa na simulação da história dos Três Porquinhos.
 * Define os métodos que todas as casas concretas (Palha, Madeira, Tijolo) devem implementar.</p>
 * @author Eduarda Ferrazza Stein
 * @version 1.0.0
 * @since 2025-11-25
 */
public interface Casa {

    /**
     * Descreve o material de construção da casa.
     * * @return Descreve o material: Palha, Madeira, Tijolo.
     */
    public String getMaterial();

    /**
     * Verifica se a casa resistiu à força de sopro aplicada pelo Lobo Mau.
     * * @param forcaDoSopro Descreve o parâmetro forcaDoSopro.
     * @return Descreve se a casa resistiu ou não ao sopro - true ou false.
     */
    public boolean resisteAoSopro(int forcaDoSopro);

    /**
     * Retorna o estado atual da casa.
     * * @return Descreve se a casa está De Pé ou Destruída.
     */
    public String getStatusAtual();
}
