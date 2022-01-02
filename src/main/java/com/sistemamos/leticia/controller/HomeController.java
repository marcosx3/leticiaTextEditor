package com.sistemamos.leticia.controller;

import com.sistemamos.leticia.services.Alertas;
import com.sistemamos.leticia.services.Arquivos;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Window;

import java.io.FileNotFoundException;
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
    private AnchorPane telaInicial;

    private Arquivos manipulacaoArquivo = new Arquivos();





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
            limparAreaTxt();
    }

    @FXML
    void openFile(ActionEvent event) throws FileNotFoundException {
        textArquivo.setText(manipulacaoArquivo.openFile());
    }

    @FXML
    void saveAs(ActionEvent event) {

    }

    @FXML
    void saveFile(ActionEvent event) throws IOException {
       String arquivo = textArquivo.getText();

        try {
            manipulacaoArquivo.writerFile(arquivo);
            Alertas sucesso = new Alertas();
            sucesso.salvoComSucesso();
        } catch (FileSystemAlreadyExistsException e){
            System.out.println(e);
        }
    }

    private void limparAreaTxt(){
        textArquivo.setText("");
    }

}
