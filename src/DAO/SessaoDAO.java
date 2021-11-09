package DAO;

import controller.CinemaController;
import model.CinemaModel;
import model.SessaoModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SessaoDAO {

 static List<SessaoModel> sessoes = new ArrayList<>();
 CinemaController cinemaController = new CinemaController();

 public void carregar(){
     try{
         BufferedReader carregar = new BufferedReader(new FileReader("sessoes.txt"));
         while(true){
             String linha = carregar.readLine();
             if (linha == null){
                 break;
             } else{
                 StringTokenizer separador = new StringTokenizer(linha,"|");
                 SessaoModel sessao = new SessaoModel();
                 sessao.setIdSessao(separador.nextToken());
                 sessao.setNomeFilme(separador.nextToken());
                 sessao.setHora(separador.nextToken());
                 sessao.setIdCinema(separador.nextToken());

                 sessoes.add(sessao);
             }
         }
         carregar.close();
     } catch (Exception e){
         System.out.println(" --- ERRO AO ABRIR ARQUIVO ---");
     }
 }

 public List<SessaoModel> visualizarSessao(){
     return sessoes;
 }

 public void salvar(){
     try{
         BufferedWriter salvar = new BufferedWriter(new FileWriter("sessoes.txt"));
         for (SessaoModel sessao : sessoes){
             salvar.write(sessao.getIdSessao() + "|" + sessao.getNomeFilme() + "|" + sessao.getHora() + "|" + cinemaController.getIdCinema());
             salvar.newLine();
         }
         salvar.close();
     } catch (IOException e){
         e.printStackTrace();
     }
 }

 public void adicionar(SessaoModel aux){
     sessoes.add(aux);
     this.salvar();
 }

 public boolean validar(String tmp1){
     for(SessaoModel sessao : sessoes){
         if(tmp1.equals(sessao.getIdSessao())){
             return false;
         }
     }
     return true;
 }
}
