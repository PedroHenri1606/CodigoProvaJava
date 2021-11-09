import controller.CinemaController;
import controller.SessaoController;
import view.CinemaView;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       CinemaView cinemaView = new CinemaView();
       CinemaController cinemaController = new CinemaController();
        SessaoController sessaoController = new SessaoController();


       sessaoController.carregarSessoes();
       cinemaController.carregar();
       cinemaView.menu();

    }
}
