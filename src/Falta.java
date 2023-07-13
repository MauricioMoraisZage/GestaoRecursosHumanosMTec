import java.time.LocalDate;

public class Falta {
    private int id;
    private int idFuncionario;
    private LocalDate data;

    public Falta(int idFuncionario, LocalDate data) {
        //this.id = id;
        this.idFuncionario = idFuncionario;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
}
