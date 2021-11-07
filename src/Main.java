import controller.CinemaController;
import view.CinemaView;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       CinemaView cinemaView = new CinemaView();
       CinemaController cinemaController = new CinemaController();

       cinemaController.carregar();

        int opcao;
        Scanner leitura = new Scanner(System.in);

        do{
            cinemaView.menuCinema();
            opcao = leitura.nextInt();

        switch (opcao) {
            case 1:
                cinemaView.cadastrar();
                break;
            case 2:
                cinemaView.listarCinema();
                break;
            case 3:
                cinemaView.remover();
                break;
        }
        } while(opcao !=0);
    }
}
