package br.com.etec.biblioteca.cadastro;

	public class ClasseInformacoes {


		//Atributo
		String titulosAt;
		String subtitulosAt;
		int numerosPaginasAt;
		String autoresAt;
		String generosAt;
		
		//Construtor vazio
		public ClasseInformacoes(){
			
		}
		
		//Construtor vazio
		public ClasseInformacoes(String autor, String titulo){
			this.autoresAt = autor;
			this.titulosAt = titulo;
		}
		
		//Getters
		public String getTitulo(){
			return titulosAt;
		}
		
		public String getSubTitulo(){
			return subtitulosAt;
		}
		
		public String getAutores(){
			return autoresAt;
		}
		
		public String getGeneros(){
			return generosAt;
		}
		
		public int getnumeroPaginas(){
			return numerosPaginasAt;
		}
		
	}