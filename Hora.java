
/**
 * Write a description of class FechaYHora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hora
{
    // instance variables - replace the example below with your own
    private NumberDisplay horas;
    private NumberDisplay minutos;
    
    /**
     * Constructor para objetos de la clase Hora
     */
    public Hora()
    {
        horas= new NumberDisplay(12);
        minutos= new NumberDisplay(59);
    }
    
    /**
     * Método para fijar la hora y los minutos
     */
    public void getHora(int hora,int minuto)
    {
        horas = new  NumberDisplay(hora);
        minutos = new NumberDisplay (minuto);
    }

    /**
     * Permita avanzar un minuto la hora almacenadas a través de un método sin parámetros.
     */
    public void avanzar()
    {
        minutos.increment();
        if (minutos.getValue() == 0){
            horas.increment();
            
        }
    }
    
    /**
     * Devuelve el valor de visualización (es decir, el valor
     * actual en forma de String de dos dígitos. Si el valor es
     * menor que diez,lo)
     */
    public void Obtenerhora()
    {
        System.out.println(horas + ":" + minutos);
    }
}


