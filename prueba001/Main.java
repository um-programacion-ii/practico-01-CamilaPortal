import entity.Despensa;
import entity.Ingrediente;

public class Main {
    public static void main(String[] args) {
        Ingrediente ingrediente1 = new Ingrediente("Agua", 500);
        Ingrediente ingrediente2 = new Ingrediente("Huevos", 6);

        System.out.println(ingrediente1);
        System.out.println(ingrediente2);

        Despensa despensa = new Despensa();

        despensa.addIngrediente(ingrediente1);
        despensa.addIngrediente(ingrediente2);

        despensa.getIngrediente("Agua", 400);
        despensa.getIngrediente("Arroz", 1);
    }

}


