package hoja1;

//Algoritmo que pida dos n�meros y diga cu�l de ellos es mayor o bien si son iguales. 
public class H1E8 {

	public static void main(String[] args) {
		int numero1, numero2;
		numero1 =  Metodo.getInt("Escribe un n�mero");
		numero2 = Metodo.getInt("Escribe otro n�mero");
		if (numero1 == numero2) {
			System.out.println("Ambos n�meros son iguales");
		} else if (numero1 > numero2) {
			System.out.println("El n�mero mayor es " + numero1);
		} else if (numero1 < numero2) {
			System.out.println("El n�mero mayor es " + numero2);
		}
	}
}
