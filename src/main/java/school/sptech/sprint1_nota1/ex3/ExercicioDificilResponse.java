package school.sptech.sprint1_nota1.ex3;

public class ExercicioDificilResponse {
    //Atributo
    private int enesimoTermo;
    private int soma;
    //Construtor
    //CHEIO
    public ExercicioDificilResponse(int enesimoTermo, int soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }
    //VAZIO
    public ExercicioDificilResponse(){}
    //Método
    public int getEnesimoTermo() {
        return enesimoTermo;
    }

    public void setEnesimoTermo(int enesimoTermo) {
        this.enesimoTermo = enesimoTermo;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
}
