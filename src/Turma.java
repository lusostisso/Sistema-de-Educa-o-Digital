import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Turma <T extends Pessoa> {
    Professor professor;
    List<T> turma = new ArrayList<>();

    public List getTurma() {
        return turma;
    }
    public void adicionaAluno (T aluno){
       this.turma.add(aluno);
       //Collections.sort(getTurma());
    }
    public void adicionaProfessor (Professor professor){
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "turma "+ turma.get(0).getClass().getSimpleName() + ": professor " + professor +
                ", alunos" + getTurma();
    }
}
