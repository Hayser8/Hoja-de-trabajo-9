/**
 * Autor: Julio García Salas
 * Tarea: Hoja de trabajo 7
 * Fecha: 25/03/2023
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import org.w3c.dom.Text;

import java.util.*;

public class main {

    public static void main(String[] args) {
        Tree<String, String> arbolUtilizar;
        String opcion;
        Scanner lector = new Scanner(System.in);
        System.out.println("¡Bienvenido! ¿Qué tipo de arbol deseas utilizar? \n[1] AVL \n[2] RedBlack");
        opcion = lector.next();
        arbolUtilizar = TreeFactory.createTree(opcion);
        System.out.println("Bienvenido a Google Translate");
        System.out.println("Ingrese la ruta de las asociaciones del diccionario:");
        String archivoDiccionario = lector.next();
        System.out.println("Ingrese la ruta del texto que quiere traducir:");
        String archivoTexto = lector.next();
        archivoTexto = TextReader.readText(archivoTexto);
        TextReader.createTranslationTree(archivoDiccionario, arbolUtilizar);


    
    
        System.out.println("\n\n--------------------------------------------------------------------------------");
        System.out.println("Texto ingresado:\n--------------------------------------------------------------------------------");
        System.out.println(archivoTexto);
        System.out.println("--------------------------------------------------------------------------------\n");
    
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Texto traducido:\n--------------------------------------------------------------------------------");
        System.out.println(traducir(archivoTexto, arbolUtilizar));
        System.out.println("--------------------------------------------------------------------------------\n");
    
        
    }
    
    public static String traducir(String texto, Tree<String, String> arbolUtilizar) {
        String result = "";
        String[] textoCortado = texto.split(" ");
        for (int i = 0; i < textoCortado.length; i ++){
            if (arbolUtilizar.search(textoCortado[i]) != null){
                result += arbolUtilizar.search(textoCortado[i])+ " ";
            }
            else {
                result += " *"+textoCortado[i]+"* ";
            }
        }
        return result;
    }
}

