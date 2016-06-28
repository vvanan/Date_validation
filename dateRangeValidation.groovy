import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

def  validate = {dateRange ->
        def d  = new Date();
        def dateFormat = new SimpleDateFormat("yyyy/mm/dd");
        def d1;
        def d2;
        try {
            if(dateRange.contains("-")){
                def dateArgs = dateRange.split("-");
                def fromDate = dateArgs[0];
                def toDate = dateArgs[1];
                    d1 = dateFormat.parse(fromDate);
                    d2 = dateFormat.parse(toDate);
                    if(d1.before(d2)){
                       println("Valid date contains '-'");
                    }else{
                       println("Start Date should be lesser than End Date");
                    }
            }else{
                d1 = dateFormat.parse(dateRange);
                d2 = d;
                if(d1.before(d2)){
                   println("Valid date");
                }else{
                   println("Start Date should be lesser than End Date");
                }
            }
        } catch (ParseException e) {
           println("Enter proper date format i.e ., in yyyy/MM/dd");
        }
    }
    
  
       // def dateClass = new DateValidation();
	   def readln = javax.swing.JOptionPane.&showInputDialog
       def input = readln 'Please enter a date range'
	   def dateClass=validate("$input");
      // def dateClass=validate("2016/06/25-2016/06/28");
    
    