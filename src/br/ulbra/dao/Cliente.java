/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Cliente {
    private String nome;
    private String fone;
    private String senha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(senha.length()==4){
        this.senha = senha.toUpperCase();
        }else{
            this.senha = "MODI";
            JOptionPane.showMessageDialog(null,"Senha criada pelo sistema "
                    + " a senha deve ser de 4 digitos",
                    "Alerta",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public String toString() {
        return nome + " - " + fone + " - " + senha+"\n";
    }
    
    
    
}
