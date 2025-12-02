package com.documentacao;

/**
 * <p>Representa um dos três porquinhos na simulação do conto. 
 * Cada porquinho pode construir sua casa e tem um nome único.</p>
 * @author Eduarda Ferrazza Stein
 * @version 1.0.0
 * @since 2025-11-25
 */
public class Porquinho {

    private String nome;

    public Porquinho(String nome) {
        this.nome = nome;
    }

    /**
     * Permite que o porquinho construa um tipo específico de casa.
     * * @param tipoCasa Descreve a casa sendo construída.
     * @link CasaDeTijolos
     */
    public void construir(Casa tipoCasa) {
    }

    /**
     * Permite que o porquinho fuja para a casa de outro porquinho.
     * * @param porquinhoAlvo Descreve o porquinho para o qual está fugindo.
     * @deprecated Sugerindo que o porquinho deve simplesmente usar a casa do irmão.
     */
    public void fugir(Porquinho porquinhoAlvo) {
    }

    /**
     * Retorna o nome do porquinho.
     * * @return Descreve o nome do porquinho: Cícero, Epa ou Prático.
     */
    public String getNome() {
        return this.nome;
    }
}