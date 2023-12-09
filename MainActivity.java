package com.example.peliculas2;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private static final String USUARIO_CORRECTO = "usuario1";
    private static final String CONTRASENA_CORRECTA = "contrasena1";

    private EditText editTextUsername;
    private EditText editTextPassword;

    private static final int GALERIA_INTERVALO_TIEMPO = 5000;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);

        Button buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        String usuario = editTextUsername.getText().toString();
        String contrasena = editTextPassword.getText().toString();

        if (usuario.equals(USUARIO_CORRECTO) && contrasena.equals(CONTRASENA_CORRECTA)) {
            Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show();

            editTextUsername.setVisibility(View.GONE);
            editTextPassword.setVisibility(View.GONE);
            findViewById(R.id.buttonLogin).setVisibility(View.GONE);

            loadMovieListFragment();
        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
        }
    }


    private void loadMovieListFragment() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, new MovieListFragment())
                .addToBackStack(null)
                .commit();
    }

    private void startGalleryWithDelay() {
        new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                startGallery();
            }
        }.start();
    }

    private void startGallery() {
        countDownTimer = new CountDownTimer(Long.MAX_VALUE, GALERIA_INTERVALO_TIEMPO) {
            @Override
            public void onTick(long millisUntilFinished) {
                showNextImage();
            }

            @Override
            public void onFinish() {
            }
        }.start();
    }

    private void showNextImage() {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, new GalleryFragment());
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void startGallery(View view) {
        startGalleryWithDelay();
    }

    @Override
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_gallery:
                showGalleryFragment();
                return true;
            case R.id.menu_exit:
                showExitConfirmationDialog();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void showGalleryFragment() {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragmentContainer, new GalleryFragment());
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private void showExitConfirmationDialog() {

    }*/
}
