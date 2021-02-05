package de.hsba.app.adapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    private String[] stringArray;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Im res Ordner ist unter arrays.xml eine Liste von Textelementen hinterlegt
        //Sie ist die Basis für die Elemente der Liste auf dem Screen
        //Hier wird die Liste der Texteelemente geladen
        Resources res = getResources();
        stringArray = res.getStringArray(R.array.samples);

        //Hier wird ein ArrayAdapter angelegt
        //Er kümmert sich um die Anlage der Listenelemente für die ListView
        //Für die Darstellung der einzelnen Listenelemente wird das list_row.xml verwendet
        arrayAdapter = new ArrayAdapter<>(this,R.layout.list_row,R.id.list_text,stringArray);

        //Raussuchen der ListView und Verbindung zum ArrayAdapter
        listView = findViewById(R.id.list_view);
        listView.setAdapter(arrayAdapter);
    }
}