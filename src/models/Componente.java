/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Programador 1
 */
public class Componente {

    private int idComponente;
    private int idAcabado;
    private int idUnidad;
    private String codigo;
    private String descripcion;
    private String rutaImagen;

    public Componente() {
    }

    public Componente(int idComponente,
            int idAcabado,
            int idUnidad,
            String codigo, String descripcion, String rutaImagen) {
        this.idComponente = idComponente;
        this.idAcabado = idAcabado;
        this.idUnidad = idUnidad;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
    }

    public int getIdComponente() {
        return idComponente;
    }

    public void setIdComponente(int idComponente) {
        this.idComponente = idComponente;
    }

    public int getIdAcabado() {
        return idAcabado;
    }

    public void setIdAcabado(int idAcabado) {
        this.idAcabado = idAcabado;
    }

    public int getIdUnidad() {
        return idUnidad;
    }

    public void setIdUnidad(int idUnidad) {
        this.idUnidad = idUnidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }
}
