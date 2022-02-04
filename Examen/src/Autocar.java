import java.util.Objects;

/**
 * 
 */

/**
 * @author David
 *
 */
public class Autocar {
	private String matricula;
	private String marca;
	private String modelo;
	private int kilometros;
	private int num_plazas;


	public Autocar() {


	}




	public String getMatricula() {
	return matricula;
	}




	public void setMatricula(String matrícula) {
	this.matricula = matrícula;
	}




	public String getMarca() {
	return marca;
	}




	public void setMarca(String marca) {
	this.marca = marca;
	}




	public String getModelo() {
	return modelo;
	}




	public void setModelo(String modelo) {
	this.modelo = modelo;
	}




	public int getKilometros() {
	return kilometros;
	}




	public void setKilometros(int kilómetros) {
	this.kilometros = kilómetros;
	}




	public int getNum_plazas() {
	return num_plazas;
	}




	public void setNum_plazas(int num_plazas) {
	this.num_plazas = num_plazas;
	}




	@Override
	public int hashCode() {
	return Objects.hash(matricula);
	}




	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Autocar other = (Autocar) obj;
	return Objects.equals(matricula, other.matricula);
	}




	@Override
	public String toString() {
	return "Autocar [matrícula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", kilómetros="
	+ kilometros + ", num_plazas=" + num_plazas + "]";
	}




	
}
