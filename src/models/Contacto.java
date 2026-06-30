package models;

public class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String telefono;
    private String apellido;

    public Contacto() {
        
    }

    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
//  Ambos sirven para comparar objetos de la clase Contacto, 
// pero se utilizan en contextos diferentes. 
// El método compareTo se utiliza para comparar dos objetos de la misma clase y 
// determinar su orden relativo, mientras que el comparador se utiliza para definir 
// un criterio de comparación personalizado para ordenar objetos de una clase específica.   
    @Override
    public String toString() {
        return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", apellido=" + apellido + "]";
    }
    
    @Override
    public int compareTo(Contacto otro) {
        return this.nombre.compareTo(otro.getNombre());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contacto other = (Contacto) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (telefono == null) {
            if (other.telefono != null)
                return false;
        } else if (!telefono.equals(other.telefono))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        return true;
    }

    
}
