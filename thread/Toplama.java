package thread;

public class Toplama implements Runnable {
	private int []dizi;
	private int ilk =0;
	private int son=0;
	
	private int toplam=0;
	public Toplama(int []dizi,int ilk ,int son) {
		
		this.dizi=dizi;
		this.ilk= ilk;
		this.son=son;
		
	}
	@Override
	public void run() {
		topla();
		
	}
	
	public void topla()
	{
		for(int i=ilk;i<son;i++)
		{
			toplam+= dizi[i];
			
		}
		
		System.out.println("toplam : "+toplam);
	}
	public int sonuc()
	{
		return toplam;
	}

}
