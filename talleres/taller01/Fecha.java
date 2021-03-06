

/**
 * La clase Fecha tiene la intención de representar el tipo abstracto fecha.
 * Aunque ya existen librerías encargadas de esta funcion:
 * @see <a href="http://www.baeldung.com/java-8-date-time-intro"> Ver documentacion tipo Time </a>
 * En este ejercicio podemos tener una compresión más profunda de su funcionamiento interno.
 *
 * @author Codigo base : Mauricio Toro, Andres Paez
 * @version 1
 *
 * @author Codigo completo : Julian Ramirez,Samuel Villegas
 * @version 1
 */

public class Fecha {

    /*
    varibales con atributo final indican que una variable es de tipo
    constante, es decir, no admitirá cambios después de su declaración y asignación de valor.
    final determina que un atributo no puede ser sobreescrito o redefinido.
    Se le asigna esta característica para evitar que se sobrescriban valores.
    tener en cuenta tipado de las 3 variables!.
    */

    private byte dia;
    private byte mes;
    private short anyo;


    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Fecha(byte dia,byte mes,short anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }


    /**
     * Método para obtener la variable global dia.
     *
     * @return el dia
     */
    public int getDia() {
        return this.dia;
    }

    /**
     * Método para obtener la variable global mes.
     *
     * @return el mes
     */
    public int getMes() {
        return this.mes;
    }

    /**
     * Método para obtener la variable global anio.
     *
     * @return el año
     */
    public int getAnyo() {
        return this.anyo;
    }

    /**
     * @param otra representa la fecha con la cual se va a comparar.
     *
     * El método comprar se encarga de devolvernos respuesta a tres posibilidades.
     * 1: si la fecha es menor que la otra retorna -1.
     * 2: si la fecha es igual que la otra retorna 0.
     * 3: si la fecha es mayor que la otra retorna 1.
     *
     * @return -1 sí es menor; 0 sí es igual; 1 sí es mayor.
     *
     */

    public int comparar(Fecha otra) {
        if (this.getAnyo() == otra.getAnyo()) {
            if (this.getMes() == otra.getMes()) {
                if (this.getDia() == otra.getDia()) {
                      return 0;
                }
                else if (this.getDia() > this.getDia()) {
                      return 1;
                }
                else if (this.getDia() < otra.getDia()) {
                     return -1;
                }
            }
            else if (this.getMes() > otra.getMes()) {
                  return  1;
            }
            else if (this.getMes() < otra.getMes()) {
                 return  -1;
            }
        }else if(this.getAnyo() > otra.getAnyo()) {
             return  1;
        }
        else if (this.getAnyo() < otra.getAnyo()) {
             return -1;
        }
        return 0;
    }

    public boolean equals(Fecha otra){
        if(this.comparar(otra) == 0){
            return true;
        }
        return false;
    }

    public String toString(){
        return dia +"/"+ mes +"/"+ anyo;
    }
}
