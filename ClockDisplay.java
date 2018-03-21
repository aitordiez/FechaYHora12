/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //Se omiten los constructores y los métodos.
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private String displayString;// Simula la pantalla real
    /**
     * Constructor para  los objetos ClockDisplay. Este constructor 
     * crea un nuevo reloj inicializadp con 00:00.
     */
    public ClockDisplay()
    {
        hours = new NumberDisplay(12);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }
    
    /**
     * Constructor para los objetos ClockDisplay. Este constructor
     * crea un nuevo reloj inicializado con la hora especificada
     * mediante los parámetros.
     */
    public ClockDisplay(int hour, int minute)
    {
        hours = new NumberDisplay(13);
        minutes = new NumberDisplay(60);
        setTime(hour, minute);
    }
     
    /**
     * Este método debe invocarse una vez cada minuto -hace
     * que la pantalla del reloj avance un minuto
     */
    public void timeTick()
    {
        minutes.increment();
        if (minutes.getValue()== 0){ // ¡Ha vuelto a cero!
            hours.increment();
        }
        updateDisplay();
    }
    
    /**
     * Fija la hora de la pantalla con la hora y los minutos
     * especificados.
     */
    public void setTime(int hour, int minute)
    {
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay();
    }
    
    /**
     * Devuelve la hora actual de esta pantalla en el formato HH:MM.
     */
    public String getTime()
    {
        return displayString;
    }
    
    /**
     * Actualiza la cadena interna que representa la pantalla.
     */
    private void updateDisplay()
    {
        displayString = hours.getDisplayValue() +
                        minutes.getDisplayValue();
    }
    
    /**
     * Almacena actualmente una referencia a un objeto impresora
     */
    public void print (String filename, boolean doubleSided)
    {
        displayString = hours.getDisplayValue() +
                        minutes.getDisplayValue();
    }
    
}