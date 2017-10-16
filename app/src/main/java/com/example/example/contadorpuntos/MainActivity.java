package com.example.example.contadorpuntos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declaracion de los elementos a usar
    private Button pOneAdd;
    private Button pTwoAdd;
    private Button pOneRemove;
    private Button pTwoRemove;

    private TextView tvScoreOne;
    private TextView tvScoreTwo;

    private int scoreOne = 0;
    private int scoreTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // referenciamos los elementos a cada id del layout correspondiente
        pOneAdd = (Button) findViewById( R.id.player_one_add_point );
        pOneRemove = (Button) findViewById( R.id.player_one_remove_point );

        pTwoAdd = (Button) findViewById( R.id.player_two_add_point );
        pTwoRemove = (Button) findViewById( R.id.player_two_remove_point );

        tvScoreOne = (TextView) findViewById( R.id.player_one_score );
        tvScoreTwo = (TextView) findViewById( R.id.player_two_score );

        pOneAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreOne++;
                tvScoreOne.setText( String.valueOf( scoreOne ) );
            }
        });

        pOneRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreOne--;
                tvScoreOne.setText( String.valueOf( scoreOne ) );
            }
        });

        pTwoAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTwo++;
                tvScoreTwo.setText( String.valueOf( scoreTwo ) );
            }
        });

        pTwoRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTwo--;
                tvScoreTwo.setText( String.valueOf( scoreTwo ) );
            }
        });





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
