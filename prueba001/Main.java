import entity.*;

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

        HuevoDuro huevoDuro = new HuevoDuro();
        Ensalada ensalada = new Ensalada();
        EnsaladaDeFrutas ensaladaDeFrutas = new EnsaladaDeFrutas();

        // Mostrar los detalles de cada receta
        System.out.println("\nReceta de Huevo Duro:");
        System.out.println(huevoDuro);

        System.out.println("\nReceta de Ensalada:");
        System.out.println(ensalada);

        System.out.println("\nReceta de Ensalada de Frutas:");
        System.out.println(ensaladaDeFrutas);
    }

}


