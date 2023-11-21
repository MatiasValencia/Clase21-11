package Model;

import java.util.*;
import java.io.*;

public class Datos {
    private ArrayList<Persona> listaPersonas;
    private String nombreArchivo;
    public Datos(String nombreArchivo) {
        listaPersonas = new ArrayList<>();
        this.nombreArchivo = nombreArchivo;
    }
    public void agregarPersona(String persona) {
        String[] personaString = persona.split(",");
        Persona aux = new Persona(personaString[0], Integer.valueOf(personaString[1]));
        listaPersonas.add(aux);
    }
    public ArrayList<String> listaPersonasString() {
        ArrayList<String> aux = new ArrayList<>();
        for (Persona p : listaPersonas) {
            aux.add(p.toString());
        }
        return aux;
    }
    public void leerArchivo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            br.readLine();
        } catch(FileNotFoundException e) {
            System.out.println("El archivo no se ha encontrado");
        }
    }
    public void guardarArchivo() {

    }
}