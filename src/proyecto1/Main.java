/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.io.*;
/**
 *
 * @author luisg
 */
public class Main {

Main() {
            String path;
            parser ThisParser;
            Yylex ThisScanner;
            path="entrada.cpp";
        try
            { 
                ThisScanner= new Yylex (new FileReader (path));

                ThisParser=new parser (ThisScanner);
                ThisParser.parse ();

                interfaz.rotular( "FIN DEL ESCANEO");
            }catch(Exception e)
                {interfaz.rotular("SE TRUNCO EL PROCESO " +e.toString());}
        }


    public static void main(String[] args) {
           new interfaz().setVisible(true);
    }
}
