package com.song.song.activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.song.song.R;
import com.song.song.adapter.CustomAdapter;
import com.song.song.model.SongBook;

import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {


    ListView listview;
    Toolbar toolbar;
    List<ParseObject> ob;
    ProgressDialog mProgressDialog;
    ArrayAdapter<String> adapter;
    Context context;
    CustomAdapter customAdapter;
    ArrayList<SongBook> myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        context = this;
        toolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolbar);
        listview = (ListView) findViewById(R.id.listView1);
        new RemoteDataTask().execute();

          /*  listview = (ListView)findViewById(R.id.listView1);

        String[] names = new String[] { "1. ALLELUIA! LE SEIGNEUR DIEU ", "2. AMEN! AMEN!",
                "3. CE QUE DIEU A FAIT POUR MOI ", "4. EN JESUS, J’AI TROUVE", "5. I HAVE SEEN THE LIGHT ", "6. LOUONS L’ETERNEL",
                "7. NUL N’EST SAINT COMME L’ETERNEL", "8. QUI EST COMME TOI", "9. SAINT, SAINT, SAINT, EST L’ETERNEL",
                "10. A DIEU SOIT LA GLOIRE!"};

        String[] lyric = new String[]{ "Alléluia! Le seigneur dieu \n" +
                "Alléluia! Le seigneur dieu\n" +
                "Omnipotent règne ;\n" +
                "Alléluia Alléluia, o Seigneur !\n" +
                "Hallelujah for the Lord God\n" +
                "Omnipotent reigneth,\n" +
                "Hallelujah to the Lord", "Amen! Amen! Louange et gloire\n" +
                "Action de grâces, et honneur,\n" +
                "Et la puissance, soit à notre Dieu\n" +
                "Aux siècles des siècles, Amen!", "Ce que Dieu a fait pour moi, \n" +
                "Je ne peux pas tout le dire\n" +
                "Il m’a sauvé, m’a lave dans Son sang\n" +
                "Je peux chanter: Alléluia! (bis)\n" +
                "Je peux chanter et louer Dieu! \n" +
                "What the Lord has done for me,\n" +
                "I cannot tell it all\n" +
                "And I can shout: Hallelujah (bis)\n" +
                "I can shout and praise the Lord", "En Jesus, j’ai trouvé\n" +
                "Ce que je n’espérais pas\n" +
                "Il m’a donné la vie, \n" +
                "Ce que je n’espérais pas\n" +
                "Il m’a donné la l’espoir, \n" +
                "Ce que je n’espérais pas\n" +
                "Il m’a donné la paix, \n" +
                "Ce que je n’espérais pas.\n" +
                "C’est pourquoi je Le chante.", "I have seen the light,\n" +
                "The light of God,\n" +
                "I have seen the light,\n" +
                "Shine in my heart,\n" +
                "I have seen the light,\n" +
                "The light of God,\n" +
                "Shine in my heart.", "Louons l’Eternel,\n" +
                "En tout lieu, en tout temps:\n" +
                "Louons l’Eternel,\n" +
                "N’importe où, n’importe quand.\n" +
                "Dans ta maison, il faut Le louer.\n" +
                "Dans ton école, il faut Le louer.", "Nul n’est saint comme l’Eternel ;\n" +
                "Nul n’est saint comme l’Eternel ;\n" +
                "Il n’y a point d’autre Dieu que Toi ;\n" +
                "Il n’y a point de rocher comme notre Dieu,\n" +
                "Nul n’est saint comme l’Eternel.\n" +
                "There is none holy as the Lord,\n" +
                "There is none beside Thee,\n" +
                "Neither is there any rock\n" +
                "Like our God\n" +
                "There is none holy as the Lord.", "Qui est comme Toi,\n" +
                "O Seigneur?\n" +
                "Parmi les Dieux, qui est comme toi?\n" +
                "Magnifique en saintété, Digne de louanges,\n" +
                "Opérant des prodiges?\n" +
                "Who is like unto thee,\n" +
                "O Lord?\n" +
                "Amongst the gods,\n" +
                "Who is like thee?\n" +
                "Glorious in holiness,\n" +
                "Fearful in praises;\n" +
                "Doing wonders hallelujah.", "Saint, saint, saint, est l’Eternel\n" +
                "Chaque jour, Il est le même,\n" +
                "Sa bonté et Sa fidélité \n" +
                "Pour nous demeurent éternellement. ", "A Dieu soit la gloire!\n" +
                "Pour son grand amour,\n" +
                "Dans mon âme noire,\n" +
                "C’est levé le jour,\n" +
                "Jésus à ma place\n" +
                "Mourut sur la croix,\n" +
                "Il m’offre sa grâce et je la reçois\n" +
                "      Chœur :\n" +
                "Gloire à Dieu! (bis)\n" +
                "Terre écoute Sa voix!\n" +
                "Gloire à Dieu! (bis)\n" +
                "Monde réjouis-toi!\n" +
                "Oh venez au père,\n" +
                "Jésus est vainqueur,\n" +
                "Que toute la terre,\n" +
                "Chante en Son honneur!\n" +
                "\n" +
                "2.  De jésus la joie, remplit notre cœur,\n" +
                "Qu’importe qu’on voit\n" +
                "Tout notre bonheur.\n" +
                "\n" +
                "3.  Selon Sa promesse,\n" +
                "Jésus changera\n" +
                "Deuil en allégresse,\n" +
                " Quand Il reviendra.\n" +
                "\tGloire à Dieu! " };

        int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] images = { R.drawable.mon5, R.drawable.mon5,
                         R.drawable.mon5, R.drawable.mon5,
                R.drawable.mon5, R.drawable.mon5, R.drawable.mon5,
                R.drawable.mon5, R.drawable.mon5, R.drawable.mon5  };

          ArrayList<SongBook> myList = new ArrayList<SongBook>();

        for (int i = 0; i < names.length; i++) {
            myList.add(new SongBook(names[i], number[i], images[i], lyric[i]));

        }

*/


    }

    private class RemoteDataTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            // Create a progressdialog
            mProgressDialog = new ProgressDialog(MainActivity.this);
            // Set progressdialog title
            mProgressDialog.setTitle("Parse.com Simple ListView Tutorial");
            // Set progressdialog message
            mProgressDialog.setMessage("Loading...");
            mProgressDialog.setIndeterminate(false);
            // Show progressdialog
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            // Locate the class table named "Country" in Parse.com
            ParseQuery<ParseObject> query = new ParseQuery<ParseObject>("Songbook");

            try {
                ob = query.find();
            } catch (com.parse.ParseException e) {
                e.printStackTrace();
                Toast.makeText(context, "error network", Toast.LENGTH_LONG).show();
            }
            return null;
        }


        @Override
        protected void onPostExecute(Void result) {
            // Locate the listview in listview_main.xml
             myList = new ArrayList<SongBook>();

            // Pass the results into an ArrayAdapter
            /*adapter = new ArrayAdapter<String>(MainActivity.this,
                    R.layout.activity_listview);*/
            // Retrieve object "name" from Parse.com database

           /* for (ParseObject songbook : ob) {
                adapter.add((String) songbook.get("name"));
            }*/

            for (ParseObject songbookParse : ob) {
                SongBook songBook = new SongBook();
                songBook.setLyrics((String)songbookParse.get("lyrics"));
                songBook.setImageId((int) songbookParse.get("imageId"));
                songBook.setName((String) songbookParse.get("name"));
                songBook.setNumber((int) songbookParse.get("number"));
                myList.add(songBook);

            }
            customAdapter = new CustomAdapter(context,myList);

            // Binds the Adapter to the ListView
            listview.setAdapter(customAdapter);
            // Close the progressdialog
            mProgressDialog.dismiss();
            // Capture button clicks on ListView items
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    // Send single item click data to SingleItemView Class
                    Intent i = new Intent(MainActivity.this,
                            SongActivity.class);
                    // Pass data "name" followed by the position
                    i.putExtra("name", ob.get(position).getString("name")
                            .toString());
                    // Open SingleItemView.java Activity
                    startActivity(i);
                }
            });
        }


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
        if (id == R.id.share) {
            String message = getResources().getString(R.string.action_share);
            Intent share = new Intent(Intent.ACTION_SEND);
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_TEXT, message);
            context.startActivity(Intent.createChooser(share, getResources().getString(R.string.share_with)));


            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

