package ke.go.kra.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class DetailsView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_details);

        final TextView view_name = (TextView)findViewById(R.id.txtVName);
        String name=getIntent().getStringExtra("name");
        view_name.setText(name);
    }
}