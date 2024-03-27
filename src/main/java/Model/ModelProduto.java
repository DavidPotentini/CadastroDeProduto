/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author USER
 */
public class ModelProduto {
    private String nome;
    private String descricao;
    private double valor;
    private boolean vendaDisponivel;

    public ModelProduto(String nome, String descricao, double valor, boolean vendaDisponivel) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.vendaDisponivel = vendaDisponivel;
    }
    
    public ModelProduto(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isVendaDisponivel() {
        return vendaDisponivel;
    }

    public void setVendaDisponivel(boolean vendaDisponivel) {
        this.vendaDisponivel = vendaDisponivel;
    }
    
    
}
