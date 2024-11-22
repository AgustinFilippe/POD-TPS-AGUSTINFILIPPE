package MobyCafe;

import java.util.ArrayList;
import java.util.List;

public class main {
    public main(String[] args) {
        tamanio tamanio = new mediano();
        
        List<ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new chocolate());
        ingredientes.add(new azucar());
        
        cafe cafe = new cafe(tamanio, ingredientes);
        
        System.out.println("El precio total del café es: " + cafe.total_price());
    }
}
