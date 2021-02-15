package com.jetbrains;

public class Metodos {
    int arreglo[];
    String calificacion;


    public int promedio(int arreglo[]) {
        int suma = 0;

        for (int x = 0; x < arreglo.length; x++) {
            suma = suma + arreglo[x];
        }
        int promedio = suma / arreglo.length;
        return promedio;
    }

    public String calificacion(int promedio){

        if(promedio <= 50){
            calificacion = "F";
        }else if(promedio <= 60){
            calificacion = "E";
        }else if(promedio <= 70){
            calificacion = "D";
        }else if(promedio <= 80){
            calificacion = "C";
        }else if(promedio <= 90){
            calificacion = "B";
        }else {
            calificacion = "A";
        }

        return calificacion;
    }

    public void resultados(String nombre, int promedio, String calificacion){
        System.out.println("Nombre de Estudiante:" +nombre);
        for (int x = 0; x < arreglo.length; x++) {
            System.out.println("Calificacion " +(x+1) +": " + arreglo[x]);
        }
        System.out.println("Promedio: "+ promedio);
        System.out.println("Calificacion: " +calificacion);
    }

}
