package Array_obj;

public class Persona {
    private String persona;
    private char genero;
    private int edad;

    public Persona(String persona, char genero, int edad) {
        this.persona = persona;
        this.genero = genero;
        this.edad = edad;
    }

    /**
     * @return String return the persona
     */
    public String getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(String persona) {
        this.persona = persona;
    }

    /**
     * @return char return the genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * @return int return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "persona=" + persona + ", genero=" + genero + ", edad=" + edad + '}';
    }

}
