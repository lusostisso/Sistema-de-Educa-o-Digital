public class Sistema {


    public static void main(String[] args) {
        Turma turmaJava = new Turma();
        Turma turmaJavaScript = new Turma();

        Java bernardo = new Java("Bernardo");
        Java leticia = new Java("Leticia");
        Java luana = new Java("Luana");

        JavaScript alana = new JavaScript("Alana");
        JavaScript bianca = new JavaScript("Bianca");
        JavaScript pedro = new JavaScript("Pedro");

        turmaJava.adicionaAluno(luana);
        turmaJava.adicionaAluno(bernardo);
        turmaJava.adicionaAluno(leticia);

        turmaJavaScript.adicionaAluno(bianca);
        turmaJavaScript.adicionaAluno(alana);
        turmaJavaScript.adicionaAluno(pedro);

        Professor kadu = new Professor("Kadu");
        Professor carlos = new Professor("Carlos");

        turmaJava.adicionaProfessor(kadu);
        turmaJavaScript.adicionaProfessor(carlos);

        System.out.println(turmaJavaScript);
        System.out.println(turmaJava);

    }
}
