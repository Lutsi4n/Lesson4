package ru.mirea.khadzhioglo.lesson4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import ru.mirea.khadzhioglo.lesson4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Fragment fragment1;
    FragmentManager fragmentManager;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fragment1 = new Music();

        binding.editTextMirea.setText("Мой номер по списку No24");
        binding.buttonMirea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment1).commit();
            }
        });
    }
}