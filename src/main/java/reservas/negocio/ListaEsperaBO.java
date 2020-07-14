package reservas.negocio;

import javax.swing.JOptionPane;
import reservas.model.CadastroVO;
import reservas.model.ListaEsperaVO;
import reservas.model.RestauranteVO;

public class ListaEsperaBO {

    public static void buscarIndice(String nome) {

        int indice;
        for (int i = 0; i < ListaEsperaVO.getFila().size(); i++) {

            if (ListaEsperaVO.getFila().get(i).getNome() == null ? nome == null
                    : ListaEsperaVO.getFila().get(i).getNome().equals(nome)) {
                indice = i;
                JOptionPane.showMessageDialog(null, "A posição na fila é " + (indice + 1), null, JOptionPane.INFORMATION_MESSAGE);
                break;

            } else if ((i == ListaEsperaVO.getFila().size() - 1)) {
                JOptionPane.showMessageDialog(null, "Cliente inexistente.", null, JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }

    public static void adicionarFila(CadastroVO cadastro) {

        ListaEsperaVO.getFila().add(cadastro);

    }

    public static void removerFila(int indice) {
        ListaEsperaVO.getFila().remove(indice);
    }

    public static void autoAlocarCliente() //Quando passando sem parametro, aloca a fila INTEIRA em mesas disponiveis
    {
        for (int indice = 0; indice < ListaEsperaVO.getFila().size(); indice++) {

            for (int j = 0; j < RestauranteVO.getListaMesas().size(); j++) {

                if (ListaEsperaVO.getFila().get(indice).getQuantidadePessoas()
                        == RestauranteVO.getListaMesas().get(j).getCadeiras()
                        & RestauranteVO.getListaMesas().get(j).getCliente() == null) {

                    RestauranteVO.getListaMesas().get(j).setCliente(ListaEsperaVO.getFila().get(indice));
                    ListaEsperaVO.getFila().remove(indice);
                    JOptionPane.showMessageDialog(null, "Clientes alocados nas mesas.", null, JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        }
    }
}
