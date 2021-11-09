package DAO;

import java.io.*;

public class IdSessaoDAO {
    public int determinarID(){
        int aux = 0;
        try{
            BufferedReader carregar = new BufferedReader(new FileReader("idCurso.txt"));
            String linha = carregar.readLine();
            if(linha == null){
                aux = 0;
            } else{
                aux = Integer.parseInt(linha);
                aux++;
            }
            carregar.close();
        } catch (Exception e){
            System.out.println("   Arquivo não existe ou não foi encontrado");
        }
        this.salvar(Integer.toString(aux));
        return aux;
    }
    public void salvar(String tmp1){
        try{
            BufferedWriter salvar = new BufferedWriter(new FileWriter("idCurso.txt"));
            salvar.write(tmp1);
            salvar.newLine();
            salvar.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
