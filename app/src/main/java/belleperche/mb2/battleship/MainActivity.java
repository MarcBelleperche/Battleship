package belleperche.mb2.battleship;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    GridLayout mainGrid;


    public final static String MESSAGE_SUPP = "android.belleperche.mb2.battleship.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        // Mettre un evenement

        setToggleEvent(mainGrid);


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
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


    private void setToggleEvent(GridLayout mainGrid) {

        // referencement de tout les enfants du mainGrid
        for (int i  =0; i <mainGrid.getChildCount();i++)
        {
            final CardView cardView = (CardView)mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1)
                    {
                    cardView.setCardBackgroundColor(Color.parseColor("#333333"));
                    Toast.makeText(MainActivity.this, "Placement(s) restants :", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                    cardView.setCardBackgroundColor(Color.parseColor("#333333"));
                    Toast.makeText(MainActivity.this, "Placement(s) restants : 5", Toast.LENGTH_SHORT).show();
                    }

                    }

                });
            }


        }




    public void play (View view)
    {
        Intent intent = new Intent(this, GAMESCREEN.class);
        //EditText editText = (EditText) findViewById(R.id.chp_saisie);
        //String message = editText.getText().toString();
        //intent.putExtra(MESSAGE_SUPP,message);
        startActivity(intent);
    }
}
