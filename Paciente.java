/**
 * @author Jennifer Sandoval,Esteban del Valle
 * @Carne 18962,18221
 * @date 02/04/19
 * @name Paciente.java
 * <p>Clase de tipo paciente  </p>
 * */
public class Paciente implements Comparable <Paciente> {
    private String nombre;
    private String sintoma;
    private String prioridad;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public  String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    
    @Override
    public  int compareTo(Paciente o) {
        int num=0;
        num=this.prioridad.compareTo(o.prioridad);
        return num;
    }
    
}
