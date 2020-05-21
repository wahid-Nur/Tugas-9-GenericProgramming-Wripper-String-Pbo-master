class Nilai<T>{
	private T t;
	public void setNilai(T t){
		this.t=t;
	}
	
	public T getNilai(){
		return t;
	}
}
public class RunNilai_Generic{
	public static void main(String[] args){
		Nilai<Integer> nilaiInteger = new Nilai<>();
		nilaiInteger.setNilai(200799);
		System.out.println("Integer : "+nilaiInteger.getNilai());
		Nilai<String> nilaiString = new Nilai<>();
		nilaiString.setNilai("Contoh Nilai ");
		System.out.println("String : "+nilaiString.getNilai());
		Nilai<Boolean> nilaiBoolean = new Nilai<>();
		nilaiBoolean.setNilai(true);
		System.out.println("Boolean : "+nilaiBoolean.getNilai());
	}
}
