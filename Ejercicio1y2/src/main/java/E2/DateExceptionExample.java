package E2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateExceptionExample {

    public static void main(String[] args) throws ExcepcionPersonalizada {
        Date date = getFecha("1997-11-27", "yyyy-dd-MM");
        System.out.println(date);
    }

    public static Date getFecha(String fecha, String formato) throws ExcepcionPersonalizada {
        SimpleDateFormat formatter = new SimpleDateFormat(formato);
        formatter.setLenient(false);
        String dateInString = fecha;
        Date fechaSalida = null;
        try {
            fechaSalida = formatter.parse(dateInString);
        } catch (ParseException e) {
            System.out.println("Error: "+e.getMessage());
            throw new ExcepcionPersonalizada("Error al convertir la fecha: " + fecha + " con formato: " + formato);
        }
        return fechaSalida;
    }


}

class ExcepcionPersonalizada extends Exception {
    public ExcepcionPersonalizada(String message) {
        super(message);
    }
}


