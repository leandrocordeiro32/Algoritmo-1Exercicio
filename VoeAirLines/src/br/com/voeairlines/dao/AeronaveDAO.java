package br.com.voeairlines.dao;

import br.com.voeairlines.entities.*;

public class AeronaveDAO {
	
	/*public void cadastrarAeronave (Aeronave aeronave) {
		
		System.out.println("Fabricante: " + aeronave.getFabricante());
		
	}*/
	
	public String cadastrarAeronave (Aeronave aeronave) {
				
		return aeronave.getCodigo();
	}

}
