
package reservas.model;

public class MesaVO {

    private CadastroVO cliente;
    private final int codigo;
    private final int cadeiras;
    
    public MesaVO (int codigo, int cadeiras) {
        
        this.codigo = codigo;
        this.cadeiras = cadeiras;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCadeiras() {
        return cadeiras;
    }

    public CadastroVO getCliente() {
        return cliente;
    }

    public void setCliente(CadastroVO cliente) {
        this.cliente = cliente;
    }

}
