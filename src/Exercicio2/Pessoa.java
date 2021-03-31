/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.ArrayList;

/**
 *
 * @author Usuário
 */
public class Pessoa {
    
    private int codigo;
    private String nome;    
    ArrayList <Automovel> automoveis;
    
    public Pessoa(){
        automoveis = new ArrayList<>();
    }

    public Pessoa(int codigo, String nome) {
        this();
        this.codigo = codigo;
        this.nome = nome;
    }

    public void inserirAutomovel(Automovel automovel){
        automoveis.add(automovel);
    }
    
    public void removerAutomovel(int index){
        automoveis.remove(index);
    }
    
    public String imprimir(){
        return "Código: " + codigo + "\n" +
                "Nome: " + nome;       
    }
    
    public String imprimirCompleto(){
        String retorno = imprimir() + "\n ----- Carros ----- \n";
        for(Automovel automovel : automoveis){
            retorno += automovel.imprimir();
        } 
        return retorno;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }
       
        
 
}
