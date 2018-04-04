package belleperche.mb2.battleship;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

public class GAMESCREEN extends AppCompatActivity {

    GridLayout mainGrid;
    public int compteur =5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamescreen);
        //GridLayout mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        // Mettre un evenement

        setToggleEvent(mainGrid);
        //gridView.addView(gridView,0);
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
                        Toast.makeText(GAMESCREEN.this, "Placement(s) restants :", Toast.LENGTH_SHORT).show();
                        compteur = compteur -1;
                    }
                    else
                    {
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(GAMESCREEN.this, "Placement(s) restants : ", Toast.LENGTH_SHORT).show();
                    }

                }

            });
        }


    }

}
