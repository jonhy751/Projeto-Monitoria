
import java.io.Serializable;

public class Horario implements Serializable {

    private String dia, mes, turno;
    private String hora;

    public Horario(String dia, String mes, String turno, String hora) {

        this.dia = dia;
        this.mes = mes;
        this.turno = turno;
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    public int compareTo(Horario o) {
        return dia.compareTo(o.getDia());
    }

}
