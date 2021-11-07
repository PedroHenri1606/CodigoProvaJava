package model;

public class SessaoModel {
    private String horario;
    private String idSessao;

    public SessaoModel() {
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(String idSessao) {
        this.idSessao = idSessao;
    }

    @Override
    public String toString() {
        return this.horario +";"+ this.idSessao;
    }
}
