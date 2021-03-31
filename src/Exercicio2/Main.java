/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Main {
   
    public static void main(String[] args) {
        int opc = 0, cod;
        String nome, marca = null, modelo =null, msg;
        ArrayList<Pessoa> listPessoa = new ArrayList<>();

        Pessoa pessoaSelecionada = null;
        Pessoa pessoaTransf = null;

        while(opc !=6){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Pessoa \n2 - Criar Automovel \n3 - Transferir Automovel "
                    + "\n4 - Mostrar todas as pessoas \n5 - Mostrar automovel da pessoa \n6 - Sair"));
            
            
            if(opc == 2 || opc == 3 || opc == 5){
                pessoaSelecionada = null;
                cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o Códigodo da Pessoa: "));
                for(Pessoa p : listPessoa){
                    if(p.getCodigo() == cod)
                        pessoaSelecionada = p;
                }
                if(pessoaSelecionada == null)
                    continue;
            }
            
            switch(opc){
                case 1: 
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Código: "));
                    nome = JOptionPane.showInputDialog("Nome: "); 
                    listPessoa.add(new Pessoa(cod, nome));
                    break;
                    
                case 2: 
                    marca =(JOptionPane.showInputDialog("Marca: "));
                    modelo =(JOptionPane.showInputDialog("Modelo: "));
                    pessoaSelecionada.inserirAutomovel(new Automovel(marca,modelo));
                    break;
                    
                case 3: 
                    marca = JOptionPane.showInputDialog("Qual marca do carro? ");
                    modelo = JOptionPane.showInputDialog("Qual modelo do carro? ");
                    int index = -1;
                    for(Automovel a : pessoaSelecionada.getAutomoveis()){
                        if(a.getModelo().equals(modelo) && a.getMarca().equals(marca))
                            index = pessoaSelecionada.getAutomoveis().indexOf(a);
                    } 
                    if(index >= 0){
                       pessoaSelecionada.removerAutomovel(index);
                    }
                    
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Para qual pessoa seria? "));
                    for(Pessoa transf : listPessoa){
                        if(transf.getCodigo() == cod)
                            pessoaTransf = transf;     
                    }  
                    for(Automovel transf : pessoaTransf.getAutomoveis()){
                        if(transf.getModelo().equals(modelo) && transf.getMarca().equals(marca))
                            index = pessoaTransf.getAutomoveis().indexOf(transf);
                    }

                    pessoaTransf.inserirAutomovel(new Automovel(marca, modelo));
                    break;
   
                case 4: 
                    msg = "";
                    for(Pessoa p : listPessoa){
                        msg += p.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);                 
                    break;
                    
                case 5: 
                    JOptionPane.showMessageDialog(null, pessoaSelecionada.imprimirCompleto());
                    break;
                    
                case 6:    
                    
                default: break;
                
            }
        }
    }
}
