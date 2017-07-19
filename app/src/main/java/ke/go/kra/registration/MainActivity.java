package ke.go.kra.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit_name = (EditText)findViewById(R.id.editName);
        final EditText edit_school = (EditText)findViewById(R.id.editSchool);
        final EditText edit_dept = (EditText)findViewById(R.id.editDept);

        Button btnSubmit = (Button)findViewById(R.id.btnRegister);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edit_name.getText().toString();
                Intent intent_registration = new Intent(MainActivity.this,DetailsView.class);
                intent_registration.putExtra("name",name);
                if (name.length()==0){
                    Toast.makeText(MainActivity.this,"Please Enter the name!",Toast.LENGTH_SHORT).show();
                }else {
                    startActivity(intent_registration);
                }
            }
        });

    }
}