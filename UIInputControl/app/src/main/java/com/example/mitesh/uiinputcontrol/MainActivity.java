package com.example.mitesh.uiinputcontrol;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
{

    ToggleButton toggleButton ;
    CheckBox ch1 , ch2 ;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButton) ;
        ch1 = (CheckBox) findViewById(R.id.checkBox) ;
        ch2 = (CheckBox) findViewById(R.id.checkBox2) ;

        ch1.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener()
                {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b)
                    {
                        Toast.makeText(MainActivity.this,"You changed Hindi ",Toast.LENGTH_SHORT).show();
                    }
                }
        );
        ch2.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener()
                {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b)
                    {
                        Toast.makeText(MainActivity.this,"You changed English ",Toast.LENGTH_SHORT).show();
                    }
                }
        );
        toggleButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(toggleButton.isChecked())
                {
                    Toast.makeText(MainActivity.this, "You turned ON the button", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "You turned OFF the button", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void openProgressDialog(View view)
    {
        ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("Downloading");
        pd.setMessage("Please wait");
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER); //try STYLE_HORIZONTAL. Horizontal dialog will not progresses until you set async task
        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        pd.show();


    }

    public void openAlertDialog(View view)
    {
        AlertDialog.Builder myalert = new AlertDialog.Builder(this);
        myalert.setTitle("Exit") ;
        myalert.setMessage("Are you sure ?") ;
        myalert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        myalert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        myalert.setCancelable(false); // does not cancel the dialog on clicking outside of dialog box
        myalert.show();
    }

}
