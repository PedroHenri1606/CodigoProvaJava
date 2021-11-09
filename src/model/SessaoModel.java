package model;

public class SessaoModel {
    private String idSessao;
    private String nomeFilme;
    private String hora;
    private String idCinema;

    public SessaoModel() {
    }

    public String getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(String idSessao) {
        this.idSessao = idSessao;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(String idCinema) {
        this.idCinema = idCinema;
    }

    @Override
    public String toString() {
        return this.idSessao + "|" + this.nomeFilme + "|" + this.hora + "|" + this.idCinema;
    }
}
