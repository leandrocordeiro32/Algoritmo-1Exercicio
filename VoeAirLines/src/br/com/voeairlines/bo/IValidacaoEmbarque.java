package br.com.voeairlines.bo;

public interface IValidacaoEmbarque {
	
	public static final int IDADEMIN = 18;
	
	public abstract String validaIdade(int idade);

}
