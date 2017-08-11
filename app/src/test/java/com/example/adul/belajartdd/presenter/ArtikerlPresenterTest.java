package com.example.adul.belajartdd.presenter;

import com.example.adul.belajartdd.ArtikelView;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by adul on 28/02/17.
 */
public class ArtikerlPresenterTest {

    @Test
    public void createNewTestArtikelPresenter() {
        ArtikelView artikelView = mock(ArtikelView.class);
        ArtikerlPresenter presenter = new ArtikerlPresenter(artikelView);
        presenter.createArtikel("", "", "");
        verify(artikelView).showEmptyInputMessage(
                "Field Judul is empty!"
        );
    }

}