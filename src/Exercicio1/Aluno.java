/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author Usuário
 */
public class Aluno {
   
    private String ra;
    private String nome;

    public Aluno() {
    }
    
    public Aluno(String ra, String nome){
        this.ra = ra;
        this.nome = nome;       
    }
    
    public String imprimir(){
        return "Nome: " + nome + "\n" + "RA: " + ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
