//Source file: C:\\USERS\\ZIVY\\DESKTOP\\Programacion\\ProyectoAlquileres\\Yate.java

/**
 * Se crea una clase Yate que hereda de EmbarcacionAMotor y de Barco a su vez,
 * y sus caracteristicas unicas
 */
public class Yate extends EmbarcacionAMotor 
{
   private int nCamarotes;
  
   /**
    * @param matricula 
    * @param eslora 
    * @param anio 
    * @param duenio 
    * @param potenciaEnCv 
    * @param nCamarotes Numero de camarotes que posee el yate
      */
   public Yate(String matricula, double eslora, int anio, Persona duenio, int potenciaEnCv, int nCamarotes) 
   {
       // Se llama al constructor de la clase superior, pasandole los parametros pertinentes
       super(matricula, eslora, anio, duenio, potenciaEnCv);
       this.nCamarotes = nCamarotes;
   }
   
   /**
    * @return nCamarotes 
    */
   public int getNCamarotes() 
   {
       return nCamarotes;
   }
   
   /**
    * El coeficiente de Bernua para un yate es su potencia en CV más su numerro de camarotes
    * @return resultado Devuelve el resultado de la suma
    */
   public int getCoeficienteBernua()
   {
       int resultado = getPotenciaEnCv() + nCamarotes;
       return resultado;
    }
   
   /**
    * @return textoADevolver
    */
   public String toString() 
   {
       String textoADevolver = super.toString();
       textoADevolver += "\n Número de camarotes: " + nCamarotes;       
       return textoADevolver;
   }
}
