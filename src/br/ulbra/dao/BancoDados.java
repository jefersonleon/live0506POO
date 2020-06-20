/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.dao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class BancoDados {

    ArrayList<Cliente> bd;

    public BancoDados() {
        bd = new ArrayList<Cliente>();
    }

    public void salvar(Cliente cli) {
        bd.add(cli);
        JOptionPane.showMessageDialog(null, "OS DADOS DO CLIENTE "
                + cli.getNome() + " FORAM SALVOS COM SUCESSO",
                "Salvar", JOptionPane.INFORMATION_MESSAGE);
    }

    public String listar() {
        String res = "           Listagem de Clientes"
                + "\n--------------------------------------------\n";
        if (!bd.isEmpty()) {
            for (int i = 0; i < bd.size(); i++) {
                res += bd.get(i).toString();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Banco de dados vazio",
                    "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        return res;
    }

    public void editar(Cliente cli, int i) {
        
         
         if(i != -1){
           if( JOptionPane.showConfirmDialog(null,"Tem certeza que deseja modificar o cliente "
                   +bd.get(i).getNome()+" pelo este novo cliente "+cli.getNome(),"confirme",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
                bd.set(i, cli);
         }else{
               JOptionPane.showMessageDialog(null, "Alteração cancelada!!");
           }
             
         }else{
             JOptionPane.showMessageDialog(null, "Cliente não encontrado");
         }
    }

    public Cliente getCliente(int indice) {   //MÉTODO PARA PEGAR O CADASTRO DEPOIS DE ENCONTRAR       
        return bd.get(indice);    //RETORNA O CONTATO QUE ESTÁ NA LISTA     
    }

    public int encontrarPessoa(Cliente cli) {      //MÉTODO PARA ENCONTRAR PESSOA, DEVOLVE INT, POIS RETORNA O ÍNDICE         
        int aux = -1;    //AUXILIAR COMEÇANDO EM -1         
        for (int i = 0; i < bd.size(); i++) {
            if (bd.get(i).getNome().equals(cli.getNome())) {    //Se o nome da lista for igual ao nome informado pelo usuário              
                aux = i;  //Auxiliar recebe o índice do nome,  que será enviado depois para o método getPessoa.             
            }
        }
        return aux;  //Retorna o índice     
    }
}
