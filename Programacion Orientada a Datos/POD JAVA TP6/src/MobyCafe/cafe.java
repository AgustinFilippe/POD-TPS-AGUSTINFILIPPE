package MobyCafe;

import java.util.List;

public class cafe {
    private tamanio tamanio;
    private List<ingrediente> ingredientes;

    public cafe(tamanio tamanio, List<ingrediente> ingredientes) {
        this.tamanio = tamanio;
        this.ingredientes = ingredientes;
    }

    public int total_price() {
        int total = tamanio.precio_final();
        for (ingrediente ingrediente : ingredientes) {
            total += ingrediente.price();
        }
        return total;
    }
}
