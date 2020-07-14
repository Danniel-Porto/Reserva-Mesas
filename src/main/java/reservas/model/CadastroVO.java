
package reservas.model;

public class CadastroVO {
    
    private static int total;
    private final String nome;
    private final int quantidadePessoas;

    public CadastroVO(String nome, int quantidadePessoas) {
        
        this.nome = nome;
        this.quantidadePessoas = quantidadePessoas;
        CadastroVO.total++;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public static int getTotal() {
        return total;
    }
}
