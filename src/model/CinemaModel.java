package model;

public class CinemaModel {
    private String nome;
    private String idCinema;
    private long   cnpj;

    public CinemaModel() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(String idCinema) {
        this.idCinema = idCinema;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return this.nome +";" + this.cnpj + ";" + this.idCinema;
    }
}
