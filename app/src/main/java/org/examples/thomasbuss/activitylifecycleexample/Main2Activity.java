package org.examples.thomasbuss.activitylifecycleexample;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast.makeText(this, "Main2Activity.onCreate", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Main2Activity.onPause", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Main2Activity.onStop", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Main2Activity.onResume", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Main2Activity.onStart", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Main2Activity.onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Main2Activity.onRestart", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onRestart");
    }

    @Override
    protected void onSaveInstanceState(Bundle b) {
        Toast.makeText(this, "Main2Activity.onSaveInstanceState", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onSaveInstanceState");
        b.putInt("Test", 4711);
    }

    @Override
    protected void onRestoreInstanceState(Bundle b) {
        int i = b.getInt("Test");
        Toast.makeText(this, "Main2Activity.onRestoreInstanceState: " + i, Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onRestoreInstanceState: " + i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Toast.makeText(this, "Main2Activity.onCreateOptionsMenu", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onCreateOptionsMenu");
        menu.add("Item 3");
        menu.add("Item 4");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, "Main2Activity.onOptionsItemSelected", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onOptionsItemSelected");
        if(item.getTitle().equals("Item 3")) {
            new AlertDialog.Builder(this)
                    .setMessage("Some message")
                    .setPositiveButton(android.R.string.ok, null)
                    .show();
        }
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        Toast.makeText(this, "Main2Activity.onPrepareOptionsMenu", Toast.LENGTH_SHORT).show();
        Log.i("Test", "Main2Activity.onPrepareOptionsMenu");
        return true;
    }
}
