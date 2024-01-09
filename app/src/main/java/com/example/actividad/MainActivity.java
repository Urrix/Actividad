package com.example.actividad;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.ExampleViewModel;
import com.example.FragmentView;

public class MainActivity extends AppCompatActivity {

    private ExampleViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(ExampleViewModel.class);
        FrameLayout container = findViewById(R.id.container);
        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new FragmentView());
            }
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Ejecuntando  onDestroy", Toast.LENGTH_SHORT).show();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Ejecuntando  onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Ejecuntando  onResume", Toast.LENGTH_SHORT).show();
    }
@Override
protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Ejecuntando  onPause", Toast.LENGTH_SHORT).show();
        }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Ejecuntando  onResume", Toast.LENGTH_SHORT).show();
    }
    }