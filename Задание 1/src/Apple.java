
public class Apple extends Food {

	private String size;
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	public void consume() {
		System.out.println(this+" �������");

	}
	public Apple(String size){
		super("������");
		this.size=size;
	}
	public String toString() {
		return super.toString()+" ������� '" +size.toUpperCase()+"'";
	}
	
}
