package com.rramos.paginasamarillasapp.models;

import java.io.Serializable;

/**
 * Created by RODRIGO on 20/09/2017.
 */

public class Empresa implements Serializable {
    private int id,telefono,logo;
    private String rubro;
    private String nombre;
    private String direccion;
    private String correo;
    private String url;
    private String info;

    public Empresa() {
    }

    public Empresa(int id, int telefono, int logo, String rubro, String nombre, String direccion, String correo, String url, String info) {
        this.id = id;
        this.telefono = telefono;
        this.logo = logo;
        this.rubro = rubro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.url = url;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", telefono=" + telefono +
                ", logo=" + logo +
                ", rubro='" + rubro + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", correo='" + correo + '\'' +
                ", url='" + url + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
