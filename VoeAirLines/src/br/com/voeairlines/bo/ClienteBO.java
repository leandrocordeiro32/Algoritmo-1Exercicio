package br.com.voeairlines.bo;

public class ClienteBO implements IValidacaoEmbarque {

	@Override   //Sobrepor - Polimorfismo
	
	public String validaIdade(int idade) {
		
		String r;
		
		if (idade < IValidacaoEmbarque.IDADEMIN) {
			
			r = "Embarque Não Autorizado";
			
		} else {
			
			r = "Embarque Autorizado. Boa Viagem!";
		}
		
		return r;
	}
	
}
