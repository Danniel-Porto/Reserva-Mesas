package reservas.negocio;

import javax.swing.JOptionPane;
import reservas.model.MesaVO;
import reservas.model.CadastroVO;
import reservas.model.RestauranteVO;

public class RestauranteBO {

    public RestauranteBO() {

        mesas();
    }

    public static void desocupar(int mesa) {

        if (RestauranteVO.getListaMesas().get(mesa).getCliente() != null) {
            RestauranteVO.getListaMesas().get(mesa).setCliente(null);
        }
    }

    public static void reservar(CadastroVO cadastro) {

        for (int i = 0; i < RestauranteVO.getListaMesas().size(); i++) {

            if (RestauranteVO.getListaMesas().get(i).getCliente() == null) {

                if (RestauranteVO.getListaMesas().get(i).getCadeiras() == cadastro.getQuantidadePessoas()) {

                    RestauranteVO.getListaMesas().get(i).setCliente(cadastro);
                    JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso! Havia uma mesa disponível.", null, JOptionPane.INFORMATION_MESSAGE);
                    break;

                } else if (i == RestauranteVO.getListaMesas().size() - 1) {

                    JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso! Adicionado a lista de espera.", null, JOptionPane.INFORMATION_MESSAGE);
                    ListaEsperaBO.adicionarFila(cadastro);
                    break;

                }
            }
        }
    }

    public static int quantidadeMesasOcupada() {

        int total = 0;

        for (int i = 0; i < RestauranteVO.getListaMesas().size(); i++) {

            if (RestauranteVO.getListaMesas().get(i).getCliente() != null) {
                total++;
            }
        }
        return total;
    }

    public static void mesas() {

        RestauranteVO.getListaMesas().add(new MesaVO(0, 2));
        RestauranteVO.getListaMesas().add(new MesaVO(1, 2));
        RestauranteVO.getListaMesas().add(new MesaVO(3, 4));
        RestauranteVO.getListaMesas().add(new MesaVO(4, 4));
        RestauranteVO.getListaMesas().add(new MesaVO(6, 6));
        RestauranteVO.getListaMesas().add(new MesaVO(7, 6));

    }

}
