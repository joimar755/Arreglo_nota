package Array_estudiantes;

public class Estudiantes {
    private int codigo;
    private String nombre;
    private String Materia;
    private float nota;

    public Estudiantes(int codigo, String nombre, String Materia, float nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.Materia = Materia;
        this.nota = nota;
    }

    public Estudiantes(float notax) {
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return this.Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public float getNota() {
        return this.nota;
    }

    public float setNota(float nota) {
        this.nota = nota;
        return nota;
    }



    @Override
    public String toString() {
        return "Estudiantes{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", Materia='" + Materia + '\'' +
                ", nota=" + nota +
                '}';
    }
}
