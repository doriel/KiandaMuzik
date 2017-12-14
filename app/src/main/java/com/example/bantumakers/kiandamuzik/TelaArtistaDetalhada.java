package com.example.bantumakers.kiandamuzik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import adapters.ArtistTrackAdapter;
import models.Album;
import models.ArtistTrackList;
import models.Artista;
import models.Track;

public class TelaArtistaDetalhada extends AppCompatActivity {

    RecyclerView listaRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaRecyclerView = findViewById(R.id.listaDeMusicas);
        setTitle("Forca Suprema");
        Artista fs = new Artista(1, "Força Suprema",  "description",  "HipHop", R.drawable.header,  true);
        Track urna = new Track();
        Album caveira = new Album( 1, "Caveira", fs.getId(),  "2017",  "500,00 kz");
        urna.setAlbum(caveira);
        urna.setArtist(fs);
        urna.setTrackCover(R.drawable.fs);
        urna.setId(1);
        urna.setaName("Urna");

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(urna);
        ArtistTrackList fsTrackList = new ArtistTrackList(1, fs.getId(), tracks);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        listaRecyclerView.setLayoutManager(linearLayoutManager);
        ArtistTrackAdapter adapter = new ArtistTrackAdapter(this, fsTrackList);
        listaRecyclerView.setAdapter(adapter);
    }
}
