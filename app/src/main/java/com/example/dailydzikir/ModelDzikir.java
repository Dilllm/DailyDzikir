package com.example.dailydzikir;

public class ModelDzikir {

    private String idDzikir;
    private String judul;
    private String subjudul;

    public ModelDzikir(String idDzikir, String judul, String subjudul) {
        this.idDzikir = idDzikir;
        this.judul = judul;
        this.subjudul = subjudul;
    }

    public String getIdDzikir() {
        return idDzikir;
    }

    public void setIdDzikir(String idDzikir) {
        this.idDzikir = idDzikir;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getSubjudul() {
        return subjudul;
    }

    public void setSubjudul(String subjudul) {
        this.subjudul = subjudul;
    }
}
