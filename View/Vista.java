package View;

import java.util.*;
import java.io.*;

public class Vista {
    private ArrayList<String> listaPersonas;
    public Vista(ArrayList<String> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }
    public void imprimirPersonas() {
        for (String p : listaPersonas) {
            System.out.println(p);
        }
    }
    public void agregarPersona(String persona) {
        
    }
}
