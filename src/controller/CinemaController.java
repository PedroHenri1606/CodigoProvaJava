package controller;

import DAO.CinemaDAO;
import model.CinemaModel;

import java.util.List;

public class CinemaController {
    CinemaDAO cinemaDAO = new CinemaDAO();

    public void adicionar(CinemaModel cinemaModel) {
        cinemaDAO.adicionar(cinemaModel);
    }
    public void carregar(){
      cinemaDAO.carregar();
    }
    public List<CinemaModel> listar(){
        return cinemaDAO.listar();
    }
    public void remover(int i){
        cinemaDAO.remover(i);
    }
}
