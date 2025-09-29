package com.fnavas.helloworld;

/**
 * Aplicación CLI mínima para el portfolio.
 * <p>
 * Patrón: Programa con punto de entrada (no aplica patrón OO específico).
 */
public class App {

    /**
     * Punto de entrada del programa.
     *
     * @param args argumentos de línea de comandos (no usados)
     */
    public static void main(String[] args) {
        System.out.println(saludo("Portfolio"));
    }

    /**
     * Devuelve un saludo simple para consola.
     *
     * @param nombre nombre de destino
     * @return saludo formateado
     */
    public static String saludo(String nombre) {
        // Aquí podrías inyectar dependencias si fuera un proyecto grande (IoC en Spring).
        return "Hola, " + nombre + "!";
    }
}
