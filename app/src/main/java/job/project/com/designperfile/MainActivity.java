package job.project.com.designperfile;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton addPost;

        addPost=(FloatingActionButton)findViewById(R.id.fab);



        addPost.setOnClickListener(view -> Toast.makeText(getBaseContext(), "Add Posts", Toast.LENGTH_SHORT).show());

    }
}
