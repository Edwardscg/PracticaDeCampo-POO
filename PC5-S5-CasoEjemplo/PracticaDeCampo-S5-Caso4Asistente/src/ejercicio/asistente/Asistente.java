/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.asistente;

/**
 *
 * @author UCLAB310
 */
public class Asistente {

    private String tipoDocumento;
    private String numeroDocumento;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombre;
    private String celular;
    private String correo;
    private int edad;
    private String categoria;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        if (tipoDocumento.equals("DNI") || tipoDocumento.equals("Carnetde Extranjería")) {
            this.tipoDocumento = tipoDocumento;
        } else {
            System.out.println("El tipo de documento no es correcto");
        }
    }
    

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        if (tipoDocumento.equals("DNI")) {
            if (numeroDocumento.length() == 8) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println("El DNI debe tener 8 dígitos");
            }
        } else if (tipoDocumento.equals("Carnet de Extranjería")) {
            if (numeroDocumento.length() == 9) {
                this.numeroDocumento = numeroDocumento;
            } else {
                System.out.println("El Carnet de Extranjería debe tener 9 dígitos");
            }
        }
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
       
        if (edad > 0 && edad <= 100) {
            this.edad = edad;
            } else {
            System.out.println("Error edad incorrecta");
        }
    }

    public String getCategoria() {
        return categoria;
    }
    

    void verAsistente() {
        System.out.println("ASISTENTE: TIPODOC: " + this.tipoDocumento + "NUMDOC: " + this.numeroDocumento
                + " PATERNO: " + this.apellidoPaterno + " MATERNO: "
                + this.apellidoMaterno
                + " NOMBRE: " + this.nombre + " CEL: " + this.celular + "CATEGORÍA: " + this.categoria
                + " EMAIL: " + this.correo + " EDAD: " + this.edad);
    }

    void categorizarPorEdad() {
        if (this.edad >= 0 && this.edad <= 10) {
            this.categoria = "Niño";
        } else if (this.edad >= 11 && this.edad <= 17) {
            this.categoria = "Adolescente";
        } else if (this.edad >= 18) {
            this.categoria = "Adulto";
        }
    }
}
