
package servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;
import modelo.Ejercicio_6;
public class Main {
  
   public static void main(String[] args) throws SQLException, IOException {
       Ejercicio_6 Estados= new Ejercicio_6();
      FileWriter flwriter = null;
       try {
            Conexion db = new Conexion();
            db.MySQLConnect();
            flwriter = new FileWriter("C:\\Escritorio\\Estados.txt");
            BufferedWriter bfwriter = new BufferedWriter(flwriter);
         
            
             /*Consulta
             */
            
            String Query = "SELECT * FROM  Estados";
            
            
            /* Se crea una declaración y se establece el Query que se
            desea ejecutar
             */
            
            db.comando = db.conexion.createStatement();
            db.registro = db.comando.executeQuery(Query);
 
            /* Se imprimen los registros que estén guardados en 
            la base de datos
            
             */
           
            while (db.registro.next()) {
                
                bfwriter.write(Estados.getId() + "," + Estados.getState() + "," + Estados.getAcronym() + "\n");
			
            }
            bfwriter.close();
        } catch (SQLException ex) {
            System.out.println("Error");
        }
    }


}

 

