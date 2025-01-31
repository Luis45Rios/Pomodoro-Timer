/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisr
 */
public class FileManagement {
    public static void createFile(String pathname) {
        File file = new File(pathname);
        try {
            if (file.createNewFile()) {
                System.out.println("Se creo el archivo");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void writeFile(String pathname, String content) {
        File file = new File(pathname);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(content);
            printWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void deleteLine(String pathname, String lineToRemove) {
        File file = new File(pathname);
        String tempFile = "temp.txt";
        File oldFile = new File(pathname);
        File newFile = new File(tempFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(tempFile, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.equals(lineToRemove)) {
                    printWriter.println(line);
                }
            }
            printWriter.close();
            bufferedReader.close();
            fileReader.close();
            oldFile.delete();
            newFile.renameTo(oldFile);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static String readFile(String pathname) {
        File file = new File(pathname);
        String content = "";
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content += line + "\n";
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return content;
    }

    public static List<String> searchInFile(String pathname, String regex) {
        File file = new File(pathname);
        List<String> lines = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.matches(regex)) {
                    lines.add(line);
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return lines;
    }

    public static String searchOneInFile(String pathname, String regex) {
        File file = new File(pathname);
        try {
            FileReader fileReader = new FileReader(file);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    if (line.matches(regex)) {
                        return line;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }

    public static void deleteInFile(String pathname, String regex) {
        File file = new File(pathname);
        String tempFile = "temp.txt";
        File oldFile = new File(pathname);
        File newFile = new File(tempFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(tempFile, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.matches(regex)) {
                    printWriter.println(line);
                }
            }
            printWriter.close();
            bufferedReader.close();
            fileReader.close();
            oldFile.delete();
            newFile.renameTo(oldFile);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void updateInFile(String pathname, String regex, String content) {
        File file = new File(pathname);
        String tempFile = "temp.txt";
        File oldFile = new File(pathname);
        File newFile = new File(tempFile);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(tempFile, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.matches(regex)) {
                    printWriter.println(content);
                } else {
                    printWriter.println(line);
                }
            }
            printWriter.close();
            bufferedReader.close();
            fileReader.close();
            oldFile.delete();
            newFile.renameTo(oldFile);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void deleteFile(String pathname) {
        File file = new File(pathname);
        if (file.delete()) {
            System.out.println("El archivo fue eliminado");
        } else {
            System.out.println("El archivo no pudo ser eliminado");
        }
    }

    public static Integer countLines(String pathname) {
        File file = new File(pathname);
        Integer count = 0;
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (bufferedReader.readLine() != null) {
                count++;
            }
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return count;
    }

}
