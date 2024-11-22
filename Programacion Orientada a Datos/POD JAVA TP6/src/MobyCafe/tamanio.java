package MobyCafe;

public abstract class tamanio {
    public static int base_price() {
        return 15;
    }

    public abstract int price();

    public int precio_final() {
        return tamanio.base_price() + this.price();
    }
}
