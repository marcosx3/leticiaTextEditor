package com.sistemamos.leticia.services;
import java.io.*;

import javafx.stage.FileChooser;


public class Arquivos {
    private final FileChooser fc = new FileChooser();

    //escreve arquivo no /temp
    public void writerFile(String content) throws IOException {
        BufferedWriter bfw = new BufferedWriter(new FileWriter("/temp/file.txt"));
        bfw.append(content);
        bfw.close();
    }
        //leitura do arquivo
    public String readFile(File file){
        StringBuilder stringBuffer = new StringBuilder();
        String text;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while ((text = bufferedReader.readLine()) != null) {
                stringBuffer.append(text).append("\n");
            }
        } catch (FileNotFoundException  ex){
            ex.printStackTrace();
            System.out.println("Arquivo nao encontrado");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
              ex.printStackTrace();
            }

        }
        return stringBuffer.toString();
    }

    // open the file
    public String openFile() throws FileNotFoundException {
        fc.setTitle("Open File");
             fc.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text Files", "*.txt")
                ,new FileChooser.ExtensionFilter("Java Files", "*.java")
                     ,new FileChooser.ExtensionFilter("C/C++ Files", "*.cpp")
                     ,new FileChooser.ExtensionFilter("JavaScript Files", "*.js")
                     ,new FileChooser.ExtensionFilter("HTML Files", "*.html")
                     ,new FileChooser.ExtensionFilter("CSS Files", "*.css")
                     ,new FileChooser.ExtensionFilter("Python Files", "*.py")
        );
        File file = fc.showOpenDialog(null);

       return readFile(file);

    }


}
