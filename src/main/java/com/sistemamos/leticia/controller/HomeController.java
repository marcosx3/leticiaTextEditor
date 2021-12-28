package com.sistemamos.leticia.controller;

import com.sistemamos.leticia.services.Arquivos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class HomeController {

    @FXML
    private MenuItem btnClose;

    @FXML
    private MenuItem btnFontes;

    @FXML
    private MenuItem btnNewDocument;

    @FXML
    private MenuItem btnNewWindow;

    @FXML
    private MenuItem btnOpenFile;

    @FXML
    private MenuItem btnSave;

    @FXML
    private MenuItem btnSaveAs;

    @FXML
    private TextArea textArquivo;

    @FXML
    void btnNewWindow(ActionEvent event) {

    }

    @FXML
    void close(ActionEvent event) {

    }

    @FXML
    void fonts(ActionEvent event) {

    }

    @FXML
    void newDocument(ActionEvent event) {

    }

    @FXML
    void openFile(ActionEvent event) {

    }

    @FXML
    void saveAs(ActionEvent event) {

    }

    @FXML
    void saveFile(ActionEvent event) throws IOException {
       String arquivo = textArquivo.getText();
        Arquivos manipulacaoArquivo = new Arquivos();
        try {
            manipulacaoArquivo.writerFile(arquivo);
            Alert alertGravado = new Alert(Alert.AlertType.CONFIRMATION);
            alertGravado.setTitle("Sucesso");
            alertGravado.setContentText("Arquivo Salvo com Sucesso!!");
            alertGravado.setHeaderText(null);
            alertGravado.showAndWait();
        } catch (FileSystemAlreadyExistsException e){
            System.out.println(e);
        }
    }

}
