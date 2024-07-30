import java.util.HashMap;

public class CancionFactory {
    private static final HashMap<String, Cancion> cancionMap = new HashMap<>();
    public static Cancion getCancion(String nombre, String genero, String artista) {
        Cancion cancion = (Cancion) cancionMap.get(nombre);
        if (cancion == null) {
            cancion = new Cancion(nombre, artista, genero);
            cancionMap.put(nombre, cancion);
            System.out.println("Se ingreso una cancion nueva " + nombre);
        } else {
            System.out.println("YA ESTA LA CANCION");
        }

        return cancion;
    }
}
