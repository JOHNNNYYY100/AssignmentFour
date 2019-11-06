class Testing {
	int New;
	String Name;
	public Testing() {
		System.out.print("Insde of the constructor");
	}
	public Testing(String Name,int New) {
		this.Name=Name;
		this.New=New;
	}
	public void Printing() {
		System.out.println(Name);
		System.out.println(New);
	}
}

public class Constructors {

	public static void main(String[] args) {
		Testing T12= new Testing("My name is JOhnny",100);
		T12.Printing();
		
		
	}

}
