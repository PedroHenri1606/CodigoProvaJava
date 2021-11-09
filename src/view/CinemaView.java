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


    public void menu(){
        int opcao;
        do{
            this.menuCinema();
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    this.cadastrar();
                    break;
                case 2:
                    this.listarCinemaSelecao();
                    break;
                case 3:
                    this.remover();
                    break;
            }
        } while(opcao !=0);
    }
    public void menuCinema(){
        System.out.println("==================================");
        System.out.println("=    [1] - Cadastrar Cinemas     =");
        System.out.println("=    [2] - Escolher Cinemas      =");
        System.out.println("=    [3] - Remover Cinemas       =");
        System.out.println("=    [0] - SAIR                  =");
        System.out.println("==================================");
    }

    public void cadastrar(){
       Scanner scan = new Scanner(System.in);
        IdCinema idCinema = new IdCinema();

        CinemaModel cinemaModel = new CinemaModel();
        System.out.println("==================================");
        System.out.println("=      Cadastro de Cinemas       =");
        System.out.print  ("= Nome: "); cinemaModel.setNome(scan.nextLine());
        System.out.print  ("= CNPJ: "); cinemaModel.setCnpj(Long.parseLong(scan.nextLine()));
        System.out.println("==================================");
        cinemaModel.setIdCinema(Integer.toString(idCinema.determinarID()));
        cinemaController.adicionar(cinemaModel);
    }

    public void listarCinema(){
        System.out.println("==================================");
        List<CinemaModel> cinemasCadastrados = cinemaController.listar();
        for(int i =0; i < cinemasCadastrados.size();i++){
            System.out.println(cinemasCadastrados.get(i).getIdCinema() + " | " + cinemasCadastrados.get(i).getNome()+ " | " + cinemasCadastrados.get(i).getCnpj()+ " Posição: "+ i);
        }
        System.out.println("==================================");

    }

    public void listarCinemaSelecao(){
        System.out.println("==================================");
        List<CinemaModel> cinemasCadastrados = cinemaController.listar();
        for(int i =0; i < cinemasCadastrados.size();i++){
            System.out.println(cinemasCadastrados.get(i).getIdCinema() + " | " + cinemasCadastrados.get(i).getNome()+ " | " + cinemasCadastrados.get(i).getCnpj());
        }
        System.out.println("==================================");

    }

    public void remover(){
        Scanner scan = new Scanner(System.in);
        this.listarCinema();
        System.out.print  (" Escolha a opção a ser removido: "); int escolha = Integer.parseInt(scan.nextLine());
        System.out.println("==================================");
        cinemaController.remover(escolha);
    }

}
