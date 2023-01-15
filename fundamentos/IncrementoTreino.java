public class IncrementoTreino {
	
	public static void main(String[] args) {

		int cachorro = 10;
		int gato = ++cachorro;
		gato = cachorro--;
		gato = cachorro++;
		System.out.println("-----Doações de cães e gatos----");
		System.out.println("Cachorros: " + cachorro);
		System.out.println("Gatos: " + gato);

	}
}