package com.example.mylist;

import androidx.annotation.NonNull;

import java.util.Date;

public class Task {
    private String titre;
    private String description;
    private Date date_debut;
    private Date date_fin;

    private Proprieter prp;

    public Task( String titre,String description,Date date_debut,Date date_fin,Proprieter prp){
        this.titre=titre;
        this.description=description;
        this.date_debut=date_debut;
        this.date_fin=date_fin;
        this.prp=prp;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public Proprieter getPrp() {
        return prp;
    }

    public void setPrp(Proprieter prp) {
        this.prp = prp;
    }

    @NonNull
    @Override
    public String toString() {
        return super.toString();
    }
}
