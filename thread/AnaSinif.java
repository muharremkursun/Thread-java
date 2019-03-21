package thread;

public class AnaSinif {
	
	public static void main(String[] args) throws InterruptedException {
		int []dizi= {1,2,3,4,5,6};
		int toplam =0;
		Toplama tp1= new Toplama(dizi,0,(dizi.length)/2);
		Thread t1= new Thread(tp1);
		t1.start();
		Toplama tp2= new Toplama(dizi,(dizi.length)/2,dizi.length);
		Thread t2= new Thread(tp2);
		t2.start();
		t2.join();
		System.out.println("genel toplam : "+(tp1.sonuc()+tp2.sonuc()));
		
	}

}
