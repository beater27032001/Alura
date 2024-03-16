package geranciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Google");
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiona(Empresa empresa) {
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
