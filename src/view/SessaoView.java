package view;

import DAO.SessaoDAO;
import controller.CinemaController;
import controller.IdSessaoController;
import controller.SessaoController;
import model.SessaoModel;

import java.util.List;
import java.util.Scanner;

public class SessaoView {

CinemaController cinemaController = new CinemaController();
SessaoModel sessaoModel = new SessaoModel();
SessaoController sessaoController = new SessaoController();
IdSessaoController idSessaoController = new IdSessaoController();

    public void menuSessoes() {
        int opcao;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("==================================");
            System.out.println(" Cinema : " + cinemaController.getNomeCinema() + "\n");
            System.out.println(" [1] - Criar Sessao ");
            System.out.println(" [2] - Listar Sessões ");
            System.out.println(" [3] - Remover Sessao ");
            System.out.println(" [0] - Voltar ");
            System.out.println("==================================");

            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    this.cadastrarSessao();
                    break;
                case 2:
                    this.listarSessoes();
                    break;
                case 3:

                    break;
            }
        } while (opcao != 0);

    }

    public void cadastrarSessao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("==================================");
        System.out.print  (" Nome do Filme: ");
        sessaoModel.setNomeFilme(scan.nextLine());
        System.out.print(" Horario: ");
        sessaoModel.setHora(scan.nextLine());
        System.out.println("==================================");
        sessaoModel.setIdSessao(idSessaoController.determinarID());
        sessaoController.adicionarSessoes(sessaoModel);
    }

    public void listarSessoes(){
        System.out.println(" Lista de Sessões de: " +cinemaController.getNomeCinema());
        System.out.println("==================================");
        List<SessaoModel> sessoesCadastradas = sessaoController.listar();
        for(int i = 0; i < sessoesCadastradas.size(); i++){
            System.out.println(sessoesCadastradas.get(i).getIdSessao() + " | " + sessoesCadastradas.get(i).getNomeFilme() + " | " + sessoesCadastradas.get(i).getHora());
        }
        System.out.println("==================================");
    }



    }

