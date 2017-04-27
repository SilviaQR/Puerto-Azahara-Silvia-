//Source file: C:\\USERS\\ZIVY\\DESKTOP\\Programacion\\ProyectoAlquileres\\Velero.java

/**
 * Se crea una clase Velero que hereda de Barco, y sus caracteristicas unicas
 */
public class Velero extends Barco 
{
   private int nMastiles;
       
   /**
    * @param matricula
    * @param eslora
    * @param anio
    * @param duenio
    * @param nMastiles Numero de mastiles que posee el velero
    */
   public Velero(String matricula, double eslora, int anio, Persona duenio, int nMastiles) 
   {
       // Se llama al constructor de la clase superior, pasandole los parametros pertinentes
       super(matricula, eslora, anio, duenio);
       this.nMastiles = nMastiles;
   }
   
   /**
    * @return nMastiles
    */
   public int getNMastiles() 
   {
       return nMastiles;
   }
   
   /**
    * El coeficiente de Bernua de un velero es su numero de mastiles
    * @return nMastiles
    */
   public int getCoeficienteBernua()
   {
       return nMastiles;
    }
   
   /**
    * @return textoADevolver
    */
   public String toString() 
   {
       String textoADevolver = super.toString();
       textoADevolver += "\n Número de mástiles: " + nMastiles;
       return textoADevolver;
   }
}
