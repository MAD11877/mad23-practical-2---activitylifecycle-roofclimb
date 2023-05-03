package sg.edu.np.mad.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView message;
    User user;

    final String TAG="Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //user=new User("John","hello", 1234,true);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG,"on start!!");
        message=(TextView)findViewById(R.id.button1);
        Button buttonA = findViewById(R.id.button1);
        buttonA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.v(TAG,"Button A clicked");
                if(user.followed){
                    user.followed=false;
                    //message.setText("Followed");
                }else{
                    user.followed=true;
                    //message.setText("Unfollow");
                }
                if(user.followed)
                {
                    message.setText("Follow");
                }else{
                    message.setText("Unfollow");
                }
            }

        });

    }
}