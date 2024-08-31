package Modelo;

public class Login {
    private int id;
    private String nombre;
    private String correo;
    private String password;
    private String rol;

    public Login() {

    }

    public Login(int id, String rol, String password, String correo, String nombre) {
        this.id = id;
        this.rol = rol;
        this.password = password;
        this.correo = correo;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
