
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Turmas implements Serializable {

    private ArrayList<Aluno> listaAlunos;
    private String turno;
    private String Turma;
    private ArrayList<Horario> listaHorarios;

    public Turmas(String turno, String Turma) {
        
        this.turno = turno;
        this.Turma = Turma;
        listaAlunos = new ArrayList();
        listaHorarios = new ArrayList();
    }

    

    public void cadastrarHorario(Horario horario) throws HorarioExistenteException {
        for (Horario a : listaHorarios) {
            if (a.compareTo(horario) == 0) {
                throw new HorarioExistenteException("Horario existe");
            }
        }

        listaHorarios.add(horario);
    }

    public ArrayList<Aluno> getListaAlunos() {

        return listaAlunos;
    }

    public void setListaAlunos(ArrayList<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public void cadastrarAluno(Aluno aluno) throws AlunoExisteException {
        for (Aluno a : listaAlunos) {
            if (a.compareTo(aluno) == 0) {
                throw new AlunoExisteException("Aluno existe");
            }
        }

        listaAlunos.add(aluno);

    }

    public Aluno consultarAluno(String a1) throws pesquisaInvalidaException {

        for (Aluno a : listaAlunos) {
            if (a.getMatricula().equals(a1)) {
                return a;
            }
        }
        throw new pesquisaInvalidaException("Pesquisa Invalida");
    }

    public String getTurma() {
        return Turma;
    }

    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    public Horario consultarHorario(String a1) {
        for (Horario h : listaHorarios) {
            if (h.getDia().equals(a1)) {
                return h;
            }

        }
        return null;

    }

    public String getTurno() {
        return turno;
    }

  
    public int compareTo(Turmas o) {
        return Turma.compareTo(o.getTurma());
    }
}
