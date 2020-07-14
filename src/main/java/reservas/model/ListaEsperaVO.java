
package reservas.model;

import java.util.ArrayList;

public class ListaEsperaVO {

  private static ArrayList<CadastroVO> fila;
  
  public ListaEsperaVO() {
      
      ListaEsperaVO.fila = new ArrayList<>();
    
}

    public static ArrayList<CadastroVO> getFila() {
        return fila;
    }


}
