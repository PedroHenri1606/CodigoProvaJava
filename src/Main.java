import controller.CinemaController;
import view.CinemaView;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
       CinemaView cinemaView = new CinemaView();
       CinemaController cinemaController = new CinemaController();

       cinemaController.carregar();
       cinemaView.menu();

    }
}
