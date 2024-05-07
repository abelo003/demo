package com.example.demo.coding;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Para {
    public static void main(String[] args) {
        String text = "Se cree ampliamente que la historia de Lorem Ipsum se origina con Cicerón en el siglo I aC y su texto De Finibus bonorum et malorum. Esta obra filosófica, también conocida como En los extremos del bien y del mal, se dividió en cinco libros. El Lorem Ipsum que conocemos hoy se deriva de partes del primer libro Liber Primus y su discusión sobre el hedonismo, cuyas palabras habían sido alteradas, añadidas y eliminadas para convertirlas en un latín sin sentido e impropio. No se sabe exactamente cuándo el texto recibió su forma tradicional actual. Sin embargo, las referencias a la frase \"Lorem Ipsum\" se pueden encontrar en la Edición de la Biblioteca Clásica Loeb de 1914 del De Finibus en las secciones 32 y 33. Fue en esta edición del De Finibus en la que H. Rackman tradujo el texto. El siguiente fragmento se selecciona de la sección 32:";
        String [] words = text.split(" ");
        Map<String, Integer> map = new HashMap();
        for (String w: words) {
           map.put(w.toLowerCase(), Integer.valueOf(map.getOrDefault(w.toLowerCase(), 0).toString()) + 1);
        }
        map.entrySet().forEach( k -> {
            System.out.println(k);
        } );
    }
}
