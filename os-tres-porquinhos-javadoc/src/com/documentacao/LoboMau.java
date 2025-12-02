package com.documentacao;

/**
 * <p>Representa o antagonista (Lobo Mau) na simulação do conto. 
 * Possui a capacidade de soprar e tentar destruir as casas dos porquinhos.</p>
 * @author Eduarda Ferrazza Stein
 * @version 1.0.0
 * @since 25 de Novembro de 2025
 */
public class LoboMau {

    /**
     * Aplica um sopro na casa alvo, testando sua resistência.
     * * @param casaAlvo Descreve a casaAlvo.
     * @see Casa#resisteAoSopro(int)
     */
    public void soprar(Casa casaAlvo) {
        int forca = getForcaDoSopro();
        casaAlvo.resisteAoSopro(forca);
    }

    /**
     * Retorna o valor inteiro da força de sopro do lobo.
     * * @return Descreve o valor inteiro da força do lobo.
     */
    public int getForcaDoSopro() {
        return (int) (Math.random() * 5) + 1;
    }
}