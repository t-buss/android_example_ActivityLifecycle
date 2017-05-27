package org.examples.thomasbuss.activitylifecycleexample;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "MainActivity.onCreate", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onCreate");
    }

    public void onButtonClick(View button) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
        Toast.makeText(this, "MainActivity.onButtonClick", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onButtonClick");
    }

    public void onButton2Click(View button) {
        Intent i = new Intent("android.intent.action.DIAL");
        startActivity(i);
        Toast.makeText(this, "MainActivity.onButton2Click", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onButton2Click");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "MainActivity.onPause", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "MainActivity.onStop", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "MainActivity.onResume", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "MainActivity.onStart", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "MainActivity.onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "MainActivity.onRestart", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle b) {
        Toast.makeText(this, "MainActivity.onSaveInstanceState", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onSaveInstanceState");
        b.putInt("Test", 4711);
    }

    @Override
    protected void onRestoreInstanceState(Bundle b) {
        int i = b.getInt("Test");
        Toast.makeText(this, "MainActivity.onRestoreInstanceState: " + i, Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onRestoreInstanceState: " + i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Toast.makeText(this, "MainActivity.onCreateOptionsMenu", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onCreateOptionsMenu");
        menu.add("Item 1");
        menu.add("Item 2");
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "MainActivity.onOptionsItemSelected", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onOptionsItemSelected");
        if(item.getTitle().equals("Item 2")) {
            new AlertDialog.Builder(this)
                    .setMessage("Some message")
                    .setPositiveButton(android.R.string.ok, null)
                    .show();
        }
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Toast.makeText(this, "MainActivity.onPrepareOptionsMenu", Toast.LENGTH_SHORT).show();
        Log.i("Test", "MainActivity.onPrepareOptionsMenu");
        return true;
    }
}
