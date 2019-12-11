package Kuliah.PBM.Project;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btn_logout;
    TextView txt_id, txt_username;
    String id, username;
    SharedPreferences sharedpreferences;

    public static final String TAG_ID = "id";
    public static final String TAG_USERNAME = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt_username = (TextView) findViewById(R.id.txt_username);
        btn_logout = (Button) findViewById(R.id.btn_logout);

        sharedpreferences = getSharedPreferences(Login.my_shared_preferences, Context.MODE_PRIVATE);

        username = getIntent().getStringExtra(TAG_USERNAME);

        txt_username.setText("Welcome " + username);

        btn_logout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // update login session ke FALSE dan mengosongkan nilai id dan username
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putBoolean(Login.session_status, false);
                editor.putString(TAG_USERNAME, null);
                editor.commit();

                Intent intent = new Intent(MainActivity.this, Login.class);
                finish();
                startActivity(intent);
            }
        });

    }
    public void food (View view){
        Intent intent = new Intent(MainActivity.this, FoodView.class);
        startActivity(intent);
    }
    public void history (View view){
        Intent intent = new Intent(MainActivity.this,SejarahView.class);
        startActivity(intent);
    }

    public void dance (View view){
        Intent intent = new Intent(MainActivity.this,DanceView.class);
        startActivity(intent);
    }

    public void destination (View view){
        Intent intent = new Intent(MainActivity.this,DestinationView.class);
        startActivity(intent);
    }
}
