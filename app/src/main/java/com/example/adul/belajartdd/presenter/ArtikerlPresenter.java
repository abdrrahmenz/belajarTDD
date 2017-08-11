package com.example.adul.belajartdd.presenter;

import com.example.adul.belajartdd.ArtikelView;

/**
 * Created by adul on 28/02/17.
 */

public class ArtikerlPresenter {

    private ArtikelView artikelView;

    public ArtikerlPresenter(ArtikelView artikelView) {
        this.artikelView = artikelView;
    }

    public boolean validateInputIsNotEmpty(String s){
        return s.isEmpty();
    }

    public void createArtikel(String judul, String kategory, String konten){
        if (validateInputIsNotEmpty(judul)){
            artikelView.showEmptyInputMessage("Field Judul is empty!");
        }else if (validateInputIsNotEmpty(kategory)){
            artikelView.showEmptyInputMessage("Field Kategori is empty!");
        }else if (validateInputIsNotEmpty(konten)){
            artikelView.showEmptyInputMessage("Field Konten is empty!");
        }else{
            artikelView.isSuccesValidateForm(judul, kategory, konten);
        }
    }
}