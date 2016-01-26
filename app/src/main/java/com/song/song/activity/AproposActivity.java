package com.song.song.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.song.song.R;

/**
 * Created by sarah on 19/01/16.
 */
public class AproposActivity extends AppCompatActivity {

    private TextView deMoi;
    private String sText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apropos);

        sText = "  CHANTS DE VIE\n" +
                "    --------------------------------------------\n" +
                "\n" +
                "\tRecueil de cantiques pour \n" +
                "\tréunions d'évangélisation, \n" +
                "\td'édification, mission de \n" +
                "\tréveil et école du dimanche etc.\n" +
                "\n" +
                "    ---------------------------------------------\n" +
                "\tCette application a été créée par \n" +
                "\tSarah Joëlle Nta; Informaticienne \n" +
                "\tet automaticienne pour la gloire \n" +
                "\t\t    de Dieu. \n" +
                "\n" +
                "   -----------------------------------------------\n" +
                "\t        Je tien a remercier :\n" +
                "\n" +
                "\t- Le Dieu tout puissant,\n" +
                "\t- Tout le personnel de DART TC,\n" +
                "\t- Gaston Ndoumbe,\n" +
                "\t- Jean Luc Nta,\n" +
                "\t- Nta Emmanuel,\n" +
                "\t- Nta Christine,\n" +
                "\t- Mes frère et sœur de l'AME,\n" +
                "\t- Muriel Moukoury";

    }
}