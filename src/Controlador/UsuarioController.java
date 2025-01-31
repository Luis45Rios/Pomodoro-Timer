package Controlador;

import Modelos.Usuario;
import Servicios.UsuarioFileManagement;

public class UsuarioController {
    private final UsuarioFileManagement usuarioService = new UsuarioFileManagement();

    public Boolean usuarioExiste(String username) {
        return usuarioService.userExists(username);
    }

    public void crearUsuario(String username, String password) {
        Usuario usuario = new Usuario(username, password);
        usuarioService.createUser(usuario);
    }

    public Boolean validarUsuario(String username, String password) {
        return usuarioService.validateUser(username, password);
    }
}
