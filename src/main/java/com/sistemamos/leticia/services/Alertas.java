package com.sistemamos.leticia.services;


import javafx.scene.control.Alert;



public class Alertas {



    public void salvoComSucesso(){
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Sucesso");
        alerta.setContentText("Arquivo Salvo com Sucesso!!");
        alerta.setHeaderText(null);
        alerta.showAndWait();

    }
}
