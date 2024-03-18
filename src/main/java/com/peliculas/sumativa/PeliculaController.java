package com.peliculas.sumativa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class PeliculaController {

    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController() {
        peliculas.add(new Pelicula(1, "The Truman Show", "Jim Carrey", "Un hombre descubre que su vida es un reality show.", 1998, "Drama"));
        peliculas.add(new Pelicula(2, "Ace Ventura: Pet Detective", "Jim Carrey", "Un detective especializado en recuperar mascotas perdidas.", 1994, "Comedia"));
        peliculas.add(new Pelicula(3, "Liar Liar", "Jim Carrey", "Un abogado no puede mentir durante 24 horas debido al deseo de cumpleaños de su hijo.", 1997, "Comedia"));
        peliculas.add(new Pelicula(4, "Eternal Sunshine of the Spotless Mind", "Jim Carrey", "Una pareja sometida a un procedimiento para borrar los recuerdos de su relación descubre lo que realmente significan el uno para el otro.", 2004, "Drama/Romance"));
        peliculas.add(new Pelicula(5, "The Mask", "Jim Carrey", "Un hombre tímido encuentra una máscara que lo transforma en un ser carismático y surrealista.", 1994, "Comedia/Action"));
        peliculas.add(new Pelicula(6, "Bruce Almighty", "Jim Carrey", "Un hombre frustrado recibe poderes divinos para enseñarle una lección sobre la responsabilidad y la gratitud.", 2003, "Comedia/Fantasía"));
        peliculas.add(new Pelicula(7, "Dumb and Dumber", "Jim Carrey", "Dos amigos de buen corazón pero increíblemente estúpidos se embarcan en un viaje por carretera para devolver una maleta llena de dinero.", 1994, "Comedia"));
        
    }

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
}
