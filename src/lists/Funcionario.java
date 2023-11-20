package lists;

public class Funcionario {
    private Integer id;
    private String name;
    private  Double salario;


    public Funcionario(){

    }
    public Funcionario(Integer id, String name, Double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void  increasySalary(double percentage) {
        salario += (salario * (percentage / 100));

    }
    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salario=" + salario +
                '}';
    }
}
