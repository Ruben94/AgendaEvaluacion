package com.company.util;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public void createFile(String file, List<String> arrData) throws IOException {
        FileWriter writer = new FileWriter(file);
        int size = arrData.size();
        for (int i=0;i<size;i++) {
            String str = arrData.get(i).toString();
            writer.write(str);
            if(i < size-1) {//This prevent creating a blank like at the end of the file**
                writer.write("\n");
            }
        }
        writer.close();
    }
    public List<String>readFile(String fileName) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentran los archivos");
        }
        BufferedReader bufferedReader = new
                BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null)
            {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
