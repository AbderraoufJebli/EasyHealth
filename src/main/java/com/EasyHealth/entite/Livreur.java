package com.EasyHealth.entite;

import util.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Livreur extends User {
    private boolean disponible;

    public Livreur(int id, String nom, String email, String telephone, String adresse, boolean disponible) {
        super(id, nom, email, telephone, adresse, UserType.Livreur);
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Livreur-specific methods
}



