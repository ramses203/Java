package generics;

public class GenericPrinter<T> {

	private T material;

	
	public void setmaterial(T material) {
		this.material = material;
		
	}
	
	public T getmaterial() {
		return material;
	}
	
	
	public String toString() {
		return material.toString();
		
	}
	
}
