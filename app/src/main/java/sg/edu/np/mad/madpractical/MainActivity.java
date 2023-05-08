package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    User user;

    final String TAG="Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=new User("John","hello", 1234,true);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.v(TAG,"on start!!");
        Button buttonA = findViewById(R.id.button1);
        buttonA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.v(TAG,"Button A clicked");
                if(user.followed){
                    buttonA.setText("Unfollow");
                    user.followed=false;
                    //message.setText("Followed");
                }else{
                    buttonA.setText("Follow");
                    user.followed=true;
                    //message.setText("Unfollow");
                }
            }

        });

    }
}