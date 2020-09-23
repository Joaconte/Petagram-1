package jcg.petagram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = findViewById(R.id.rvActivityMain);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarListaMascotas(){

        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Cerdo", R.drawable.cerdo, 1));
        mascotas.add(new Mascota("Conejo", R.drawable.conejo, 2));
        mascotas.add(new Mascota("Elefante", R.drawable.elefante, 3));
        mascotas.add(new Mascota("Gallo", R.drawable.gallo, 4));
        mascotas.add(new Mascota("Gato", R.drawable.gato, 5));
        mascotas.add(new Mascota("Mono", R.drawable.mono, 6));
        mascotas.add(new Mascota("Oso", R.drawable.oso, 7));
        mascotas.add(new Mascota("Oveja", R.drawable.oveja, 8));
        mascotas.add(new Mascota("Perro", R.drawable.perro, 9));
        mascotas.add(new Mascota("Vaca", R.drawable.vaca, 10));
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);

    }

    public void clickIrAMascotasFavoritas(View target) {
        Intent intent = new Intent(MainActivity.this, MascotasFavoritasActivity.class);
        startActivity(intent);
    }

}