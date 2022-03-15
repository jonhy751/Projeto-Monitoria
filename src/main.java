
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) throws IOException {

        ObjectOutputStream print = null;
        ObjectInputStream read = null;
        File f = null;
        Aluno a = null;
        FileInputStream stream = null;
        f = new File("arquivo/conta.ser");
        if (!f.exists()) {
            if (!f.getParentFile().exists()) {
                f.getParentFile().mkdirs();
            }
            f.createNewFile();
        }
        stream = new FileInputStream(f);
        if (stream.available() != 0) {
            read = new ObjectInputStream(stream);
            try {
                a = (Aluno) read.readObject();
            } catch (ClassNotFoundException ex) {
                System.out.println("Classe não encontrada!");
            }
        } else {
            a = new Aluno("jonhy", "123", "info","vesp");
            
        }

        Turmas t1 = new Turmas("vesp","Informatica");
        try {
            t1.cadastrarAluno(a);
        } catch (AlunoExisteException ex) {
            System.out.println(ex.getMessage());
        }

        
        System.out.println(a.getNome());
        a.setNome("Eita");
        System.out.println(a.getFrequencia());
        System.out.println(a.getFrequencia());
        System.out.println(a.getFrequencia());
        Horario h1 = new Horario("10", "4", "vesp", "13:00");
  try {
            print = new ObjectOutputStream(new FileOutputStream(f));
            print.writeObject(a);
            print.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            t1.cadastrarHorario(h1);
        } catch (HorarioExistenteException ex) {
            System.out.println(ex.getMessage());
        }
        Horario h2 = new Horario("10", "4", "vesp", "13:00");
        try {
            t1.cadastrarHorario(h2);
        } catch (HorarioExistenteException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
