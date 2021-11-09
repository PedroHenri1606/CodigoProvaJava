package controller;

import DAO.SessaoDAO;
import model.SessaoModel;

import java.util.List;

public class SessaoController {
    SessaoDAO sessaoDAO = new SessaoDAO();

    public void carregarSessoes(){ sessaoDAO.carregar();}
    public void salvarSessoes(){ sessaoDAO.salvar();}
    public void adicionarSessoes(SessaoModel tmp1){ sessaoDAO.adicionar(tmp1);}
    public boolean validarSessoes(String tmp1){ return sessaoDAO.validar(tmp1);}
    public List<SessaoModel> listar(){ return sessaoDAO.visualizarSessao();}

}
