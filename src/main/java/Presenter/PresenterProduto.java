/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Presenter;

import Model.ModelProduto;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class PresenterProduto {
    private ArrayList<ModelProduto> produto = new ArrayList<>();
    
    public boolean salvar(ModelProduto p){
        if(p!=null){
            produto.add(p);
            return true;
        }else{
            return false;
        }
    }
    
    public ArrayList<ModelProduto> retornarTodos(){
        return produto;
    }
}
