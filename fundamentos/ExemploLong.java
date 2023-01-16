public class ExemploLong {
	
	public static void main(String[] args) {
  
  		long populacaoUberlandia = 699_097;
  		long populacaoUberlandia2 = 2_147_483_648L; // colocando L no final o java entende que o valor é long e nao inteiro

  		System.out.println(2_147_483_648); // não printa. O Java entende q o numero e inteiro e esse numero e muito grande pra ser inteiro.
		System.out.println(2_147_483_648L); // Agora o Java entende 

	}
}