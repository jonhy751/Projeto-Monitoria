
import java.io.Serializable;
import java.util.ArrayList;

public class Monitoria implements Serializable {
private Monitor monitor;
private String turma;
private String turno;

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor m) {
        this.monitor = m;
    }

    public ArrayList<Turmas> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(ArrayList<Turmas> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }
    ArrayList<Turmas> listaTurmas = new ArrayList();

    public void cadastrarTurma(Turmas turma) throws turmaExisteException {
        for (Turmas t : listaTurmas) {
            if (t.compareTo(t) == 0) {
                throw new turmaExisteException("Turma existe");

            }

        }
        listaTurmas.add(turma);
    }

}
