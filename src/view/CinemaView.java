package view;

import DAO.IdCinema;
import controller.CinemaController;
import model.CinemaModel;
import model.SessaoModel;

import java.util.List;
import java.util.Scanner;

public class CinemaView {
    Scanner leitura = new Scanner(System.in);
    CinemaController cinemaController = new CinemaController();

    public void menuCinema(){
        System.out.println("==================================");
        System.out.println("=    [1] - Cadastrar Cinemas     =");
        System.out.println("=    [2] - Escolher Cinemas      =");
        System.out.println("=    [3] - Remover Cinemas       =");
        System.out.println("=    [0] - SAIR                  =");
        System.out.println("==================================");
    }

    public void cadastrar(){

        IdCinema idCinema = new IdCinema();

        CinemaModel cinemaModel = new CinemaModel();
        System.out.println("==================================");
        System.out.println("=      Cadastro de Cinemas       =");
        System.out.print  ("= Nome: "); cinemaModel.setNome(leitura.nextLine());
        System.out.print  ("= CNPJ: "); cinemaModel.setCnpj(Long.parseLong(leitura.nextLine()));
        System.out.println("==================================");
        cinemaModel.setIdCinema(Integer.toString(idCinema.determinarID()));
        cinemaController.adicionar(cinemaModel);
    }

    public void listarCinema(){
        System.out.println("==================================");
        List<CinemaModel> cinemasCadastrados = cinemaController.listar();
        for(int i =0; i < cinemasCadastrados.size();i++){
            System.out.println(cinemasCadastrados.get(i).getIdCinema() + "  /  " + cinemasCadastrados.get(i).getNome()+ "  /  " + cinemasCadastrados.get(i).getCnpj()+ " Posição: "+ i);
        }
        System.out.println("==================================");

    }

    public void remover(){
        this.listarCinema();
        System.out.print  (" Escolha a opção a ser removido: "); int escolha = Integer.parseInt(leitura.nextLine());
        System.out.println("==================================");
        cinemaController.remover(escolha);
    }

}
