package data;

import model.*;

public class GestorServicios {

    public void mostrarServicios() {
        RutaGastronomica ruta1 = new RutaGastronomica(5, "Sabores del Valle de Colchagua", 6);

        RutaGastronomica ruta2 = new RutaGastronomica(4, "Gastronomía Mapuche en Temuco", 3);

        PaseoLacustre paseo1 = new PaseoLacustre("Catamarán", "Panorámico", 40, "Navegación Lago Llanquihue", 2);

        PaseoLacustre paseo2 = new PaseoLacustre(
                "Lancha", "Aventura", 15, "Recorrido Bahía de Puerto Varas", 1);

        ExcursionCultural excursion1 = new ExcursionCultural(
                "Teatro del Lago", "María López", "Ruta Patrimonial Frutillar", 3);

        ExcursionCultural excursion2 = new ExcursionCultural(
                "Fuerte Reina Luisa", "Carlos Pérez", "Historia de Osorno", 5);

        ExcursionCultural excursion3 = new ExcursionCultural(
                "Museo Histórico Nacional", "Ana Torres", "Patrimonio de Santiago", 2);

        System.out.println(ruta1.toString());

        System.out.println(ruta2.toString());

        System.out.println(paseo1.toString());

        System.out.println(paseo2.toString());

        System.out.println(excursion1.toString());

        System.out.println(excursion2.toString());
        System.out.println(excursion3.toString());
    }

}
