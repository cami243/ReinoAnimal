package ReinoAnimal;

public class Principal {
	
	public static void main(String[] args) {
	
		Aquatico a = new Aquatico(null, null, null, null, false);
		a.setSexo("femea");
		a.setEspecie(" Carcharias taurus ");
		a.setDataNascimento("7");
		a.setTipoAgua("água salgada");
		a.setPossuiEscama(false);
		a.comer();
		a.nadar();
		a.perfil();
		
		Aquatico a1 = new Aquatico(null, null, null, null, false);
		a1.setSexo("macho");
		a1.setEspecie(" Pygocentrus natterer ");
		a1.setDataNascimento("3");
		a1.setTipoAgua("água doce");
		a1.setPossuiEscama(true);
		a1.comer();
		a1.nadar();
		a1.perfil();
		
		Terrestre t = new Terrestre(null, null, null, null, false);
		t.setSexo("fêmea");
		t.setEspecie("Felis catus");
		t.setDataNascimento("2");
		t.setRegiao("Asia");
		t.setPelo(true);
		t.comer();
		t.mover();
		t.perfil();
	
		Terrestre t2 = new Terrestre(null, null, null, null, false);
		t2.setSexo("macho");
		t2.setEspecie("Hydrochoerus hydrochaeris");
		t2.setDataNascimento("8");
		t2.setRegiao("America do sul");
		t2.setPelo(true);
		t2.comer();
		t2.mover();
		t2.perfil();
		
		Aereo aer = new Aereo(null, null, null, 0);
		aer.setEspecie("Coragyps atratus");
		aer.setSexo("macho");
		aer.setDataNascimento("3");
		aer.setAltitude(54.5);
		aer.comer();
		aer.voar();
		aer.perfil();
		
		Aereo aer2 = new Aereo(null, null, null, 0);
		aer2.setEspecie("Amazona aestiva");
		aer2.setSexo("femea");
		aer2.setDataNascimento("10");
		aer2.setAltitude(37.9);
		aer2.comer();
		aer2.voar();
		aer2.perfil();
		
	
	}

}
