public class Multiple {
	public static void main (String [] args){
	HybridPen hp = new HybridPen();
	hp.details();
	}
}

interface Pen {
	void details ();
}

interface Pencil {
	default void details (){
	System.out.println("This comes from a PENCIL");
	}
}

class HybridPen implements Pencil, Pen{
	public void details(){
		System.out.println("Inside HYBRID ");
		//Pen.super.details();
		Pencil.super.details();
	}
}