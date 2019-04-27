package com.example.mitesh.mynewasyncdemo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MyProgressTask extends AsyncTask<Void, Integer, String> {

    Context ctx;
    ProgressDialog pd;

    public MyProgressTask(Context ct)
    {
        ctx = ct;
    }

    @Override
    protected void onPreExecute() {
        pd = new ProgressDialog(ctx);
        pd.setTitle("Downloading");
        pd.setMessage("Please wait");
        pd.setMax(10);
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "Canncel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                cancel(true);
            }
        });
        pd.show();
    }

    @Override
    protected String doInBackground(Void... voids) {

        try
        {
            for(int i = 0 ; i <= 10 ; i++)
            {
                Thread.sleep(2000);
                Log.i("Thread", "Execute"+ i);
                publishProgress(i);
            }
            return "Successful" ;
        }catch (Exception e)
        {
            Log.i("Exception",e.getMessage());
            return  "Failure" ;
        }
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        int myValue = values[0];
        pd.setProgress(myValue);
    }

    @Override
    protected void onPostExecute(String s) {
        Toast.makeText(ctx,s,Toast.LENGTH_SHORT).show();
        pd.dismiss();
    }
}
