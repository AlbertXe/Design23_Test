package i_composite.example3;

public class Leaf extends Component{
	private String name;

	public Leaf(String name) {
		this.name = name;
	}
	
	public void printStruct(String preStr){
		System.out.println(preStr+"-"+name);
	}
	
	
}
