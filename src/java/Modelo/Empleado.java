/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Empleado {
    int id;
    String dni;
    String nomb;
    String telf;
    String estad;
    String user;

    public Empleado() {
    }

    public Empleado(int id, String dni, String nomb, String telf, String estad, String user) {
        this.id = id;
        this.dni = dni;
        this.nomb = nomb;
        this.telf = telf;
        this.estad = estad;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getEstad() {
        return estad;
    }

    public void setEstad(String estad) {
        this.estad = estad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
