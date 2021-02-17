package domain;

/**
 *
 * @author Israel Sanchez Aguil
 */
public class Usuario {

    private String username;
    private String password;
    private int idUsuario;

    public Usuario() {
    }

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Usuario(String username, String password, int id_usuario) {
        this.username = username;
        this.password = password;
        this.idUsuario = id_usuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int id_usuario) {
        this.idUsuario = id_usuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + idUsuario +", username=" + username + ", password=" + password +  '}';
    }

}
