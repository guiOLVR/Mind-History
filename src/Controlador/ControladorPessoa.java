package Controlador;

import Persistencia.PessoaPersistencia;
import model.Pessoa;

/**
 *
 * @author gui_m
 */
public class ControladorPessoa {
    private PessoaPersistencia pessoaDB;
    
    public ControladorPessoa(PessoaPersistencia passageiroDB){
        this.pessoaDB = passageiroDB;
    }
    
    public void save(Pessoa psg) throws ICadastradoPessoaJaExiste{
        pessoaDB.pesquisaPessoa(psg.getCpf());
        if(!consultaPassageiroPorNome(psg)){
            pessoaDB.cadastraPessoa(psg);
        }else{
            throw new ICadastradoPessoaJaExiste();
        }
    }
    
    public boolean consultaPassageiroPorNome(Pessoa psg){
     // boolean result = pessoaDB.pesquisaPessoaNome(psg.getNome()); 
      return true;
    }

    public void savarPassageiro(Pessoa ps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
