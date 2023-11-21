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
            String linea;
            while ((linea = br.readLine()) != null) {
                agregarPersona(linea);
            }
            br.close();
        } catch(Exception e) {
            System.out.println("El archivo no se ha encontrado");
        }
    }
    public void guardarArchivo() {
        ArrayList<String> aux = listaPersonasString();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
            for (String p : aux) {
                bw.write(p);
            }
            bw.close();
        } catch(Exception e) {
            System.out.println("El archivo no se ha encontrado");
        }
    }
}