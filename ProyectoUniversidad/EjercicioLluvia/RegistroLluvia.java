import java.util.Scanner;

public class RegistroLluvia{
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);
        double lluviaMes[] = new double[12]; //Arreglo Para almacenar la cantidad de lluvia en cada mes.
        double totalLluvia = 0;
        int mesMayorLluvia = 0;
        int mesMenorLluvia = 0;

        //Arreglo para lectura de datos
        for(int i=0; i < 12; i++){
        System.out.println("Ingrese la cantidad de lluvia para el mes " + (i+1) + " en metros cubicos: " + " ");
        lluviaMes[i] = scanner.nextDouble();
        totalLluvia += lluviaMes[i];

        //Asignaciones y actualizaciones de datos
            if(lluviaMes[i] > lluviaMes[mesMayorLluvia]){
            mesMayorLluvia = i;
            }
            if(lluviaMes[i] < lluviaMes[mesMenorLluvia]){
            mesMenorLluvia = i;
            }
        }

        //Cálculo del promedio
        double promedioLluvia = totalLluvia / 12;

        //Resultados
        System.out.println("El mes con mayor cantidad de lluvia: " + (mesMayorLluvia + 1) + " con un total de " + lluviaMes[mesMayorLluvia] + " metros cubicos");
        System.out.println("El mes con menor cantidad de lluvia: " + (mesMenorLluvia + 1) + " con un total de " + lluviaMes[mesMenorLluvia] + " metros cubicos");
        System.out.println("El promedio de lluvia durante el año es de: " + promedioLluvia + (" metros cúbicos"));
    }
}