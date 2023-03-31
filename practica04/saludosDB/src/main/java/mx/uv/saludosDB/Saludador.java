package mx.uv.saludosDB;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Saludador {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Saludador() {
    }

    public Saludador(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

}
