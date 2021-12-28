package com.sistemamos.leticia.services;
import javafx.concurrent.Task;
import javafx.stage.FileChooser;

import java.io.*;
import java.util.Scanner;

public class Arquivos {

    //escreve arquivo no /temp
    public void writerFile(String content) throws IOException {
        BufferedWriter bfw = new BufferedWriter(new FileWriter("/temp/file.txt"));
        bfw.append(content);
        bfw.close();
    }


    // open the file
    public void openFile() throws FileNotFoundException {
        File file = new File("/temp/file.txt");
        Scanner scan = new Scanner(file);
        while (scan.hasNext()){
            System.out.println(scan.nextLine());
        }

    }


}
