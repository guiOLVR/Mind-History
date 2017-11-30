package Main;
 
import Persistencia.PessoaPersistencia;
import model.Pessoa;

/**
 *
 * @author gui_m
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa ps = new Pessoa(00000,"teste", "testedenovo", "21382121", "teste@teste.com", 0);
        PessoaPersistencia pdb = new PessoaPersistencia();
        pdb.cadastraPessoa(ps);
    }
    
}
