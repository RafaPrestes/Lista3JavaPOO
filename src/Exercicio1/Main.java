/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Main {

    
    public static void main(String[] args) {
        int opc = 0;
        int cod, ch;
        String nome, ra, msg;
        ArrayList<Curso> listCurso = new ArrayList<>();
        Curso cursoSelecionado = null;
        while(opc != 6){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Curso \n2 - Criar Aluno \n3 - Remover Aluno "
                    + "\n4 - Mostrar todos os cursos \n5 - Mostrar alunos do curso \n6 - Sair"));
            
            if(opc == 2 || opc == 3 || opc == 5){
                cursoSelecionado = null;
                cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o Códigodo curso: "));
                for(Curso c : listCurso){
                    if(c.getCodigo() == cod)
                        cursoSelecionado = c;
                }
                if(cursoSelecionado == null)
                    continue;
            }
            
            switch(opc){
                case 1: 
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Código: "));
                    nome = JOptionPane.showInputDialog("Nome: ");
                    ch = Integer.parseInt(JOptionPane.showInputDialog("Carga Horária: "));
                    listCurso.add(new Curso(cod,nome,ch));
                    break;
                case 2:           
                    ra = JOptionPane.showInputDialog("RA: ");
                    nome = JOptionPane.showInputDialog("Nome: ");
                    cursoSelecionado.inserirAluno(new Aluno(ra, nome));
                    break;
                case 3: 
                    ra = JOptionPane.showInputDialog("Digite o RA: ");
                    int index = -1;
                    for(Aluno a : cursoSelecionado.getAlunos()){
                        if(a.getRa().equals(ra))
                            index = cursoSelecionado.getAlunos().indexOf(a);
                    }
                    if(index >= 0)
                        cursoSelecionado.removerAluno(index);
                    break;
                case 4: 
                    msg = "";
                    for(Curso c : listCurso){
                        msg += c.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                    break;
                case 5: 
                    JOptionPane.showMessageDialog(null, cursoSelecionado.imprimirCompleto());
                    break;
                case 6: break;
                default: break;
            }
        }
    }
    
}
