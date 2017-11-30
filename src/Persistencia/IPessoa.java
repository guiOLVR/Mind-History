/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import model.Pessoa;

/**
 *
 * @author gui_m
 */
public interface IPessoa{
    
    public void cadastraPessoa(Pessoa ps);
    public void editaPessoa(Pessoa ps);
    
    public Pessoa pesquisaPessoa(int cpf);
    public Pessoa pesquisaPessoaNome (String nome);
}
