
public class Salario {
    private int id;
    private int idFuncionario;
    private double valor;

    public Salario(int idFuncionario, double valor) {
        //this.id = id;
        this.idFuncionario = idFuncionario;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public double getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
