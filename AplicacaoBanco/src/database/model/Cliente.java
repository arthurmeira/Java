package database.model;

public class Cliente {
    private int id;
    private String nm_cliente;
    private String cpf;

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nm_cliente='" + nm_cliente + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNm_cliente() {
        return nm_cliente;
    }

    public void setNm_cliente(String nm_cliente) {
        this.nm_cliente = nm_cliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
