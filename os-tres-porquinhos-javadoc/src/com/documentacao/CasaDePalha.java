package com.documentacao;

/**
 * <p>Implementação da casa de palha. É o tipo de casa mais frágil na simulação.</p>
 * @author Eduarda Ferrazza Stein
 * @version 1.0.0
 * @since 2025-11-25
 */
public class CasaDePalha implements Casa {

    private boolean destruida = false;

    @Override
    /**
     * Descreve o material de construção da casa.
     * * @return Descreve o material: Palha, Madeira, Tijolo.
     */
    public String getMaterial() {
        return "Palha";
    }

    @Override
    /**
     * Verifica se a casa resistiu à força de sopro aplicada pelo Lobo Mau.
     * Assume-se que a casa de Palha é destruída com qualquer força > 0.
     * * @param forcaDoSopro Descreve o parâmetro forcaDoSopro.
     * @return Descreve se a casa resistiu ou não ao sopro - true ou false.
     */
    public boolean resisteAoSopro(int forcaDoSopro) {
        if (forcaDoSopro > 0) {
            this.destruida = true;
            return false;
        }
        return true;
    }

    @Override
    /**
     * Retorna o estado atual da casa.
     * * @return Descreve se a casa está De Pé ou Destruída.
     */
    public String getStatusAtual() {
        return destruida ? "Destruída" : "De Pé";
    }
}