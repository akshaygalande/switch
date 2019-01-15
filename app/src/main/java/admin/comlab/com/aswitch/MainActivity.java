package admin.comlab.com.aswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void check(View view) {
        Switch wifi1=findViewById(R.id.wifi);
        Switch blue1=findViewById(R.id.bluetooth);
        Boolean wifi=wifi1.isChecked();
        Boolean blue=blue1.isChecked();
        if(wifi && blue){
            Toast.makeText(getApplicationContext(),"Both are On",Toast.LENGTH_SHORT).show();
        }
        else if(wifi ){
            Toast.makeText(getApplicationContext(),"Wifi is On",Toast.LENGTH_SHORT).show();
        }
       else if(blue ){
            Toast.makeText(getApplicationContext(),"Bluetooth is On",Toast.LENGTH_SHORT).show();
        }
    }

}
