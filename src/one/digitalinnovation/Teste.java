package one.digitalinnovation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import one.digitalinnovation.facade.Facade;

public class Teste {
	
	public static void main(String[] args) {

	Facade facade = new Facade();
	Calendar c = Calendar.getInstance();
	Date data = c.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

	
	System.out.println("Data Atualização: " + sdf.format(data));
	facade.migrarCliente("Drew Ferran", "20102011");
	facade.migrarCliente("Lady Whitley", "20122013");
	facade.migrarCliente("Kelsey Hayes", "20112011");

	}
	
}
