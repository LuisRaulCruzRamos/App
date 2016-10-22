package ni.edu.uca.drawer;

import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar mToolBar;
    NavigationView mNavigatioView;

    public static final String TAG= MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolBar = (Toolbar) findViewById(R.id.toobar);
        setSupportActionBar(mToolBar);
        mNavigatioView= (NavigationView) findViewById(R.id.navView);
        mNavigatioView.setNavigationItemSelectedListener(this);
        mNavigatioView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Log.d(TAG,"Clase Main Activity: ");
                if (item.getItemId()== R.id.opcion1){
                    Log.d(TAG, "onNavigationItemSelected" + "Opcion1");
                }
                return false;
            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Log.d(TAG, "OnNavigationItemSelected");
        return true;
    }
}
