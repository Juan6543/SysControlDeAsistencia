package SysControlDeAsistencia.Entidades;
import java.time.LocalDate;
public class Usuario {

    private int IdUsuario;
    private String Nombre;
    private String Apellido;
    private int IdRol;
    private int IdGrupo;
    private LocalDate FechaDeNacimiento;
    private LocalDate FechaDeRegistro;
    private String Direccion;
    private String Codigo;
    private String Telefono;
    private String Departamento;
    private String Foto;
    private int Estado;
    private String Rfid;
    private String Password;
    private String Login;
    private Asistencia asistencias;
    private Rol rol;
    private Grupo grupo;

}
