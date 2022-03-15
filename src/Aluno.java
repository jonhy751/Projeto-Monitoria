
import java.io.Serializable;
import java.util.ArrayList;

public class Aluno implements Serializable,Comparable<Aluno> {

    private String nome;
    private String matricula;
    private String curso;
    private int frequencia;
    private String turno;

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Aluno(String nome, String matricula, String curso, String turno) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.frequencia = frequencia;
        this.turno = turno;
    }
    
   

    

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int x) {
        this.frequencia=+x;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    @Override
    public int compareTo(Aluno o) {
        return matricula.compareTo(o.getMatricula());
    }

 

    

}
