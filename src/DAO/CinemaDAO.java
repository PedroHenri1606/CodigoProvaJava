package DAO;

import model.CinemaModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CinemaDAO {
    static List<CinemaModel> cinemas = new ArrayList<>();
    static int cinemaAtual;

    public void adicionar(CinemaModel cinemaModel) {
        cinemas.add(cinemaModel);
        this.salvar();
    }

    public void salvar() {
        try {
            BufferedWriter salvar = new BufferedWriter(new FileWriter("cinemas.txt"));
            for (int i = 0; i < cinemas.size(); i++) {
                salvar.write(cinemas.get(i).toString());
                salvar.newLine();
            }
            salvar.close();

        } catch (IOException e) {
            System.out.println("  ! ARQUIVO N/ EXISTE OU N/ FOI ENCONTRADO !  ");
        }
    }

    public List<CinemaModel> listar(){
        return cinemas;
    }

    public void carregar() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("cinemas.txt"));
            while(true){
                String linha =bufferedReader.readLine();
                if(linha == null){
                    break;
                } else {
                    StringTokenizer stringTokenizer = new StringTokenizer(linha,";");
                    CinemaModel cinemaModel = new CinemaModel();
                    cinemaModel.setNome(stringTokenizer.nextToken());
                    cinemaModel.setCnpj(Long.parseLong(stringTokenizer.nextToken()));
                    cinemaModel.setIdCinema(stringTokenizer.nextToken());
                    cinemas.add(cinemaModel);
                }

            }
        } catch (IOException e) {
        }
    }

    public void remover(int i){
         cinemas.remove(i);
         this.salvar();
    }

    public boolean login (String tmp1){
        for (int i = 0; i < cinemas.size(); i++){
            if (tmp1.equals(cinemas.get(i).getIdCinema())){
                System.out.println(" ---Cinema Selecionado com sucesso--- ");
                cinemaAtual = i;
                return true;
            }
        }
        return false;
    }

    public String getNomeCinema(){
        return cinemas.get(cinemaAtual).getNome();}
    }

