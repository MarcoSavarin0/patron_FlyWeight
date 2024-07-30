import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CancionTest {
    @Test
    @DisplayName("Testeando")
    void caso1(){
        List<Cancion> canciones = new ArrayList<>();
        canciones.add(new Cancion("Bohemian Rhapsody", "Queen", "Rock"));
        canciones.add(new Cancion("Billie Jean", "Michael Jackson", "Pop"));
        canciones.add(new Cancion("Stairway to Heaven", "Led Zeppelin", "Rock"));
        canciones.add(new Cancion("Goteo","Duki","Trap"));
        int totalCanciones = canciones.size();
        for (int i = 0; i < 100; i++) {
           Cancion cancion = canciones.get(i % totalCanciones);
           String nombre = cancion.getNombre();
            String artista = cancion.getArtista();
            String genero = cancion.getGenero();
            CancionFactory.getCancion(nombre,artista,genero);
        }
    }
}