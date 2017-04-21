package phanso;

public class phanso {

	private int tuso;
	private int mauso;
	public phanso()
	{
		setTuso(0);
		mauso=1;
	}
	
	public phanso(int ts, int ms)
	{
		setTuso(ts);
		mauso=ms;
	}
	public String ToString()
	{
		String tam= "";
		tam= String.valueOf(getTuso()) +"/"+ String.valueOf(mauso);
		return tam;
		
	}
	 int UCLN(int a, int b){
		int kq=1;
		int m= Math.min(a,b);
		for (int i=m;i>0;i--)
			if(b%i==0)
			{
				kq=i; break;
			}
		return kq;
	}
	public phanso toigian(){
		phanso p=new phanso();
		int ucln=UCLN(tuso,mauso);
		p.tuso=tuso/ucln;
		p.mauso=mauso/ucln;
		return p;
	}
	public phanso tong(phanso ps)
	{
		phanso p= new phanso();
		p.tuso= ps.tuso*this.mauso + ps.mauso*this.tuso;
		p.mauso= ps.mauso * this.mauso;
		return p;
	}
	public int sosanh (phanso ps)
	{
		int kq=0;
		double so1 = (double)this.tuso/this.mauso;
		double so2 = (double)ps.tuso/ps.mauso;
		if(so1==so2) kq=0;
		if(so1<so2) kq=-1;
		if(so1>so2) kq=1;
		return kq;
	}

	public int getTuso() {
		return tuso;
	}

	public void setTuso(int tuso) {
		this.tuso = tuso;
	}
	
}
