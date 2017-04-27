//Source file: C:\\USERS\\ZIVY\\DESKTOP\\Programacion\\ProyectoAlquileres\\EmbarcacionDeportivaAMotor.java

/**
 * Se crea una clase EmbarcacionAMotor que hereda de Barco, y sus caracteristicas unicas
 */
public class EmbarcacionAMotor extends Barco 
{
    private int potenciaEnCv;

    /**
     * @param matricula
     * @param eslora
     * @param anio
     * @param duenio
     * @param potenciaEnCv Potencia de la embarcacion en CV
     */
    public EmbarcacionAMotor(String matricula, double eslora, int anio, Persona duenio, int potenciaEnCv) 
    {
        // Se llama al constructor de la clase superior, pasandole los parametros pertinentes
        super(matricula, eslora, anio, duenio);
        this.potenciaEnCv = potenciaEnCv;
    }

    /**
     * @return potenciaEnCv
     */
    public int getPotenciaEnCv() 
    {
        return potenciaEnCv;
    }
   
    /**
     * El coeficiente de Bernua se calcula obteniendo la potencia en CV
     * @return potenciaEnCv
     */
    public int getCoeficienteBernua(){
        return potenciaEnCv;
    }   

    /**
     * @return textoADevolver
     */
    public String toString() 
    {
        String textoADevolver = super.toString();
        textoADevolver += "\n Potencia en CV: " + potenciaEnCv;
        return textoADevolver;
    }
}
