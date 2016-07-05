import java.text.DateFormat;
import java.text.SimpleDateFormat
import java.util.regex.*;


class DateValidation {

  static void main(String[] args){
       
       def readln = javax.swing.JOptionPane.&showInputDialog
       def input = readln 'Please enter a date range'
       def (from, to) = input.tokenize('-')
       
       boolean validFrom = from ? isValid(from): false
       assert validFrom : "From date is not a valid one. Date should be in yyyyMMdd format"
       
       boolean validTo = to ? isValid(to) : true
       assert validTo : "To date is not a valid one. Date should be in yyyyMMdd format"
      
       DateFormat df = new SimpleDateFormat("yyyyMMdd")
       to = to ?:df.format(Calendar.getInstance().getTime())
   
      /* assert from <= to : " From date should be less than or equal to To date" 
       println " date Range is valid " */
       
       def fromDate = new Date().parse("yyyyMMdd", from)
       def toDate = new Date().parse("yyyyMMdd", to)
       assert fromDate<=(toDate) : " From date should be less than or equal to To date" 
       println " date Range is valid " 
	   println " date Range is valid.. " 
       
  }
   
   static boolean isValid(String dateStr) {
         return dateStr.matches("\\d{4}\\d{2}\\d{2}");
   }

}