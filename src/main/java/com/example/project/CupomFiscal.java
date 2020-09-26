package com.example.project;

public class CupomFiscal {

		public static String BRK = System.lineSeparator();


		public static String dadosLojaParam(String nomeLoja, String logradouro, int numero, String complemento,
			String bairro, String municipio, String estado, String cep, String telefone, String observacao, String cnpj,
			String inscricaoEstadual) {

		if (nomeLoja.isEmpty()){
			throw new RuntimeException ("O campo nome da loja é obrigatório");
		}

		if (logradouro.isEmpty()){
			throw new RuntimeException ("O campo logradouro do endereço é obrigatório");
		}

		String _logradouro = logradouro + ", ";
		String _numero = numero <=0 ? "s/n" : String.format("%d", numero);
		String _complemento = complemento.isEmpty() ? "" : " " + complemento;
		String _bairro = bairro.isEmpty() ? "" : bairro + " - ";
	
		if(municipio.isEmpty()) {
			throw new RuntimeException("O campo município do endereço é obrigatório");
		}
		String _municipio = municipio + " - "; 
		
		if(estado.isEmpty()) {
			throw new RuntimeException("O campo estado do endereço é obrigatório");
		}

		String _cep = cep.isEmpty() ? "" : "CEP:" + cep;
		String _telefone = telefone.isEmpty() ? "" : "Tel " + telefone;
		_telefone = (!_telefone.isEmpty() && !_cep.isEmpty()) ? " " + _telefone : _telefone;
		String _observacao = observacao.isEmpty() ? "" : observacao;
		
		if(cnpj.isEmpty()){
			throw new RuntimeException("O campo CNPJ da loja é obrigatório");
		}

		String _cnpj = "CNPJ: " + cnpj;
		
		if(inscricaoEstadual.isEmpty()){
			throw new RuntimeException("O campo inscrição estadual da loja é obrigatório");
		}

		String _inscricao_estadual = "IE: " + inscricaoEstadual;

		String dados_cupom = nomeLoja + BRK;
		dados_cupom += _logradouro + _numero + _complemento  + BRK;
		dados_cupom += _bairro + _municipio + estado + BRK;
		dados_cupom +=  _cep + _telefone + BRK;
		dados_cupom +=  _observacao + BRK;
		dados_cupom +=  _cnpj + BRK;
		dados_cupom +=  _inscricao_estadual + BRK;

		return dados_cupom;

	}

}