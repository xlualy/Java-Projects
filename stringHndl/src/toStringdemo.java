
public class toStringdemo {

	/**
	 * to String demo
	 */
	int w;
	int h;
	toStringdemo(int w,int h){
		this.w=w;
		this.h=h;
	}
	
//	public String toString(){
//		return "Diamention width "+w+" height "+h;
//		
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		toStringdemo st=new toStringdemo(4, 5);
		System.out.println(st);
	}

}
