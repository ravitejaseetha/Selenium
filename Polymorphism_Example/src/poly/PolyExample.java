package poly;

public class PolyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vet vt = new Vet();
         Dog dg = new Dog();
         Hippo hp = new Hippo();
         vt.giveShot(dg);
         vt.giveShot(hp);
         dg.dogNoise();
         System.out.println(dg.getClass());
         dg.beFriendly();
         dg.play();
         
	}

}