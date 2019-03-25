package com.abdo.electromecanique.pdf;


import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import com.abdo.electromecanique.R;
import java.io.File;
import java.util.ArrayList;


public class main_pdfview extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.FROYO)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfview);

        final GridView gv= (GridView) findViewById(R.id.gv);
        gv.setAdapter(new CustomAdapter(main_pdfview.this,getPDFs()));

    }

    @RequiresApi(api = Build.VERSION_CODES.FROYO)
    private ArrayList<PDFDoc> getPDFs()

    {
        ArrayList<PDFDoc> pdfDocs=new ArrayList<>();
        // @SuppressLint("SdCardPath") File downloadsFolder = new File("/data/data/" + getPackageName() + "/assets/pdf/");
                //TARGET FOLDER
         File downloadsFolder= Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);

        PDFDoc pdfDoc;

        if(downloadsFolder.exists())
        {
            //GET ALL FILES IN DOWNLOAD FOLDER
            File[] files=downloadsFolder.listFiles();

            //LOOP THRU THOSE FILES GETTING NAME AND URI
            for (int i=0;i<files.length;i++)
            {
                File file=files[i];

                if(file.getPath().endsWith("pdf"))
                {
                    pdfDoc=new PDFDoc();
                    pdfDoc.setName(file.getName());
                    pdfDoc.setPath(file.getAbsolutePath());

                    pdfDocs.add(pdfDoc);
                }

            }
        }

        return pdfDocs;
    }


}
