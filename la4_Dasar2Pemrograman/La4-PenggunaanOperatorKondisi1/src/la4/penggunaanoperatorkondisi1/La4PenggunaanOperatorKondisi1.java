/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package la4.penggunaanoperatorkondisi1;

/**
 *
 * @author V5
 */
public class La4PenggunaanOperatorKondisi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           String      status = "";
           int  grade = 80;
           
           //mendapatkan status pelajar
           status = (grade >= 60)?"Passed":"Fail";
           
           //print status
           System.out.println( status );
    }
}
