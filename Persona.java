//Source file: C:\\USERS\\ZIVY\\DESKTOP\\Programacion\\ProyectoAlquileres\\Cliente.java

/**
 * Se crea una clase Persona que representara al dueño del barco, junto con sus datos identificativos
 */
public class Persona 
{
   private String nombrePersona;
   private String dni;
   
     /**
   @param nombrecliente Sera el nombre del dueño del barco
   @param dni DNI del dueño del barco
    */
   public Persona(String nombrePersona, String dni) 
   {
       this.nombrePersona = nombrePersona;
       this.dni = dni;
   }
   
   /**
    * @return nombrePersona
    */
   public String getNombrePersona() 
   {
       return nombrePersona;
   }
   
   /**
    * @return dni
    */
   public String getDniPersona() 
   {
       return dni;
   }
   
   /**
    * @return textoADevolver
    */
   public String toString() 
   {
       String textoADeovlver = " Propietario: " + nombrePersona + "\n DNI: " + dni;
       return textoADeovlver;
   }
}
