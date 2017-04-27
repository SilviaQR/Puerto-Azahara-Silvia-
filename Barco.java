//Source file: C:\\USERS\\ZIVY\\DESKTOP\\Programacion\\ProyectoAlquileres\\Barco.java

/**
 * Se crea una clase abstracta para un barco y sus caracteristicas
 */
public abstract class Barco 
{
    private String nMatricula;
    private double eslora;
    // Sera el a�o de fabricacion del barco
    private int anioFabricacion;
    private Persona duenioBarco;

    /**
    @param matricula Matricula del barco
    @param eslora Tama�o de la eslora del barco en metros
    @param duenio Identificacion del due�o del barco
     */
    public Barco(String nMatricula, double eslora, int anioFabricacion, Persona duenioBarco) 
    {
        this.nMatricula = nMatricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.duenioBarco = duenioBarco;
    }

    /**
     * @return nMatricula
     */
    public String getNMatricula() 
    {
        return nMatricula;
    }

    /**
     * @return eslora Devuelve la longitud del barco
     */
    public double getEslora() 
    {
        return eslora;
    }

    /**
     * @return anioFabricacion
     */
    public int getAnioFabricaion() 
    {
        return anioFabricacion;
    }

    /**
     * @return duenioBarco
     */
    public Persona getDuenioBarco() 
    {
        return duenioBarco;
    }

    /**
     * @see Clase: Velero, metodo: getCoeficienteBernua()
     * @see Clase: Yate, metodo: getCoeficienteBernua()
     * @see Clase: EmbarcacionAMotor, metodo: getCoeficienteBernua()
     */
    public abstract int getCoeficienteBernua() ;

    /**
     * @return textoAMostrar 
     */
    public String toString() 
    {
        String textoAMostrar = duenioBarco.toString() + " Matr�cula: " + nMatricula + "\n Eslora: " + eslora + "\n A�o de fabricaci�n: " + anioFabricacion;
        return textoAMostrar;
    }
}
