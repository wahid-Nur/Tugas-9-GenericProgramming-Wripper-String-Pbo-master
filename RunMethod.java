class Method<T> {
    
    private T Manusia;
    
    protected void setManusia(T Manusia){
        this.Manusia = Manusia;
    }
    
    protected T getManusia(){
        return Manusia;
    }
}
public class RunMethod {
    public static void main(String[] args){
        Method<String> nama = new Method<>();
        nama.setManusia("Yulianti");
        System.out.println("Nama Saya: "+nama.getManusia());
        
        Method<Integer> umur = new Method<>();
        umur.setManusia(20);
        System.out.println("Usia Saya: "+umur.getManusia()+" Tahun");
        
        Method<Boolean> kondisi = new Method<>();
        kondisi.setManusia(true);
        System.out.println("Saya Sedang Belajar Java : "+kondisi.getManusia());
        
        Method<Float> IPK = new Method<>();
        IPK.setManusia(3.5f);
        System.out.println("Nilai IPK Saya: "+IPK.getManusia());
        
        Method<Character> Karakter = new Method<>();
        Karakter.setManusia('Y');
        System.out.println("Huruf Awalan Nama Saya Adalah: "+Karakter.getManusia());
    }
}
