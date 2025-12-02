package com.ejercicio.mi_api_render;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // Esto es vital para que Ionic pueda leer los datos
public class Controlador {

    @GetMapping("/superheroes")
    public List<Map<String, Object>> obtenerSuperheroes() {
        List<Map<String, Object>> lista = new ArrayList<>();

        // Superhéroe 1: Spiderman
        Map<String, Object> h1 = new HashMap<>();
        h1.put("id", 1);
        h1.put("nombre", "Spiderman");
        h1.put("poder", "Sentido arácnido y lanzar redes");
        h1.put("empresa", "Marvel");
        h1.put("imagenUrl", "https://upload.wikimedia.org/wikipedia/en/2/21/Web_of_Spider-Man_Vol_1_129-1.png");
        
        // Superhéroe 2: Batman
        Map<String, Object> h2 = new HashMap<>();
        h2.put("id", 2);
        h2.put("nombre", "Batman");
        h2.put("poder", "Dinero y tecnología");
        h2.put("empresa", "DC");
        h2.put("imagenUrl", "https://upload.wikimedia.org/wikipedia/en/c/c7/Batman_Infobox.jpg");

        // Superhéroe 3: Wonder Woman
        Map<String, Object> h3 = new HashMap<>();
        h3.put("id", 3);
        h3.put("nombre", "Wonder Woman");
        h3.put("poder", "Fuerza sobrehumana y lazo de la verdad");
        h3.put("empresa", "DC");
        h3.put("imagenUrl", "https://upload.wikimedia.org/wikipedia/en/9/93/Wonder_Woman.jpg");

        lista.add(h1);
        lista.add(h2);
        lista.add(h3);

        return lista;
    }
}