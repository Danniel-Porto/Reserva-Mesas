
package reservas.model;

import java.util.ArrayList;

public class RestauranteVO {

    private static ArrayList<MesaVO> listaMesas;

    public RestauranteVO() {

        RestauranteVO.listaMesas = new ArrayList<>(10);
    
    }


    public static ArrayList<MesaVO> getListaMesas() {
        return listaMesas;  
    }
}
