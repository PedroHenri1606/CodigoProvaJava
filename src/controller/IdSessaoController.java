package controller;

import DAO.IdSessaoDAO;
import DAO.SessaoDAO;

public class IdSessaoController {
        IdSessaoDAO x = new IdSessaoDAO();
        public String determinarID(){
            String tmp1 = Integer.toString(x.determinarID());
            return tmp1;
        }
}
