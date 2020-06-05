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

}
