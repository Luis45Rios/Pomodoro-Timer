package Servicios;

import Modelos.Usuario;

public class UsuarioFileManagement {
    private static final String FILE_NAME = "users.txt";

    public Boolean userExists(String username) {
        String regex = username + "\\|.*";
        return FileManagement.searchOneInFile(FILE_NAME, regex) != null;
    }

    public void createUser(Usuario usuario) {
        FileManagement.createFile(FILE_NAME);
        if (!userExists(usuario.getUsername())) {
            String content = usuario.getUsername() + "|" + usuario.getPassword() + ";";
            FileManagement.writeFile(FILE_NAME, content);
        }
    }

    public Boolean validateUser(String username, String password) {
        String regex = username + "\\|" + password + ";";
        return FileManagement.searchOneInFile(FILE_NAME, regex) != null;
    }
}
