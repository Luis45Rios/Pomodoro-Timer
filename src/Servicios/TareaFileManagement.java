package Servicios;

import java.util.ArrayList;
import java.util.List;

import Modelos.Tarea;

public class TareaFileManagement {
    private static final String FILE_NAME = "tasks.txt";

    public Integer getTaskId() {
        return FileManagement.countLines(FILE_NAME) + 1;
    }

    public void createTask(Tarea tarea) {
        FileManagement.createFile(FILE_NAME);
        String content = tarea.getId() + "|" + tarea.getNombre() + "|" + tarea.getTiempoEnfoque() + "|"
                + tarea.getNumeroPomodoros() + "|" + tarea.getUsername() + ";";
        FileManagement.writeFile(FILE_NAME, content);
    }

    public List<Tarea> getTasks(String username) {
        String regex = ".*\\|" + username + ";";
        List<String> tasksRecords = FileManagement.searchInFile(FILE_NAME, regex);
        List<Tarea> tasks = new ArrayList<Tarea>();
        for (String taskRecord : tasksRecords) {
            String[] taskData = taskRecord.split("\\|");
            Integer id = Integer.parseInt(taskData[0]);
            String nombre = taskData[1];
            Integer tiempoEnfoque = Integer.parseInt(taskData[2]);
            Integer numeroPomodoros = Integer.parseInt(taskData[3]);
            Tarea tarea = new Tarea(id, nombre, tiempoEnfoque, numeroPomodoros, username);
            tasks.add(tarea);
        }

        return tasks;
    }

    public void deleteTask(Integer id) {
        String regex = id + "\\|.*;";
        FileManagement.deleteInFile(FILE_NAME, regex);
    }

    public void updateTask(Tarea tarea) {
        String regex = tarea.getId() + "\\|.*;";
        String content = tarea.getId() + "|" + tarea.getNombre() + "|" + tarea.getTiempoEnfoque() + "|"
                + tarea.getNumeroPomodoros() + "|" + tarea.getUsername() + ";";
        FileManagement.updateInFile(FILE_NAME, regex, content);
    }
}
