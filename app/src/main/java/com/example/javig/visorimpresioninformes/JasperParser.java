package com.example.javig.visorimpresioninformes;

import android.content.Context;
import android.os.Environment;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.util.JRXmlUtils;
import net.sf.jasperreports.engine.xml.JRXmlDigester;

import org.w3c.dom.Document;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class JasperParser {

    private Context mContext;
    String textoGenerado = "";
    // Localización de la plantilla (carpeta "descargas" para hacer pruebas)
    String filePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS) + File.separator + "facturaSimplificada.jrxml";

    public JasperParser(Context context){
        mContext = context;
    }

    public String parseXML() {
        String salida = "";

        try {
            Document document = JRXmlUtils.parse(JRLoader.getLocationInputStream(filePath));

        } catch (JRException e) {
            e.printStackTrace();
        }

        return salida;
    }
}
