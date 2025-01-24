/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisr
 */
public class FileManagment {

    public static void createFile(String FileName) {
        File file = new File(FileName);

        try {
            PrintWriter out = new PrintWriter(file);
            out.close();
            System.out.println("Se creo el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }

    }

    public static void writeArchive(String FileName, String content) {
        File file = new File(FileName);

        try {
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            out.println(content);
            out.close();
            System.out.println("Se escribio en el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static String readArchive(String fileName) {
        File file = new File(fileName);
        StringBuilder content = new StringBuilder();

        try {
            BufferedReader input = new BufferedReader(new FileReader(file));
            String reading = input.readLine();
            while (reading != null) {
                content.append(reading).append("\n");
                reading = input.readLine();
            }
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        return content.toString();
    }

    public static void deleteArchive(String FileName) {
        File file = new File(FileName);
        System.out.println(file.exists());
        file.delete();
        System.out.println("Se elimino el archivo");

    }

    public static void addUser(String fileName, String newUser, String newPassword) {
        // Leer el contenido del archivo para verificar duplicados
        String fileContent = FileManagment.readArchive(fileName);

        if (fileContent != null && !fileContent.isEmpty()) {
            // Dividir el contenido en líneas
            String[] lines = fileContent.split("\n");
            for (String line : lines) {
                // Dividir cada línea en usuario y contraseña
                String[] credentials = line.split(",");
                if (credentials.length == 2) {
                    String user = credentials[0].trim();
                    // Verificar si el usuario ya existe
                    if (user.equals(newUser.trim())) {
                        System.out.println("El usuario ya existe en el archivo.");
                        return; // Salir sin escribir el usuario duplicado
                    }
                }
            }
        }

        // Si el usuario no existe, escribirlo en el archivo
        String content = newUser + "," + newPassword;
        writeArchive(fileName, content);
    }
}
