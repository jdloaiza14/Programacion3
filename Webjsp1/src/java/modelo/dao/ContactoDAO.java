
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.Contacto;

/**
 *
 * @author juanx
 */
public class ContactoDAO {
    private static final List<Contacto> lista =new ArrayList <Contacto>();

    public ContactoDAO() {
    }
    
    public List<Contacto>readAll(){
    
        return lista;
}
    public void create(Contacto nuevo){
        lista.add(nuevo);
}
    public boolean delete(Contacto elim){
        return lista.remove(elim);
    }
        
    }