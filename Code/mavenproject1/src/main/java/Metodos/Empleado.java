/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Metodos;

/**
 *
 * @author esteb
 */
public class Empleado {
    String nombreCompleto;
    String cedula;
    String fechaDeIngreso;
    String direccion;
    String telefonoConvencional;
    String telefonoCelular;
    String email;
    String telefonoReferencia;
    String nombreReferencia;
    String pcHome;
    String internet;

    public Empleado() {
    }

    public Empleado(String nombreCompleto, String cedula, String fechaDeIngreso, String direccion, String telefonoConvencional, String telefonoCelular, String email, String telefonoReferencia, String nombreReferencia, String pcHome, String internet) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.fechaDeIngreso = fechaDeIngreso;
        this.direccion = direccion;
        this.telefonoConvencional = telefonoConvencional;
        this.telefonoCelular = telefonoCelular;
        this.email = email;
        this.telefonoReferencia = telefonoReferencia;
        this.nombreReferencia = nombreReferencia;
        this.pcHome = pcHome;
        this.internet = internet;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(String fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoConvencional() {
        return telefonoConvencional;
    }

    public void setTelefonoConvencional(String telefonoConvencional) {
        this.telefonoConvencional = telefonoConvencional;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefonoReferencia() {
        return telefonoReferencia;
    }

    public void setTelefonoReferencia(String telefonoReferencia) {
        this.telefonoReferencia = telefonoReferencia;
    }

    public String getNombreReferencia() {
        return nombreReferencia;
    }

    public void setNombreReferencia(String nombreReferencia) {
        this.nombreReferencia = nombreReferencia;
    }

    public String getPcHome() {
        return pcHome;
    }

    public void setPcHome(String pcHome) {
        this.pcHome = pcHome;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }
}
