public class ClassBaseGuitar extends ClassStringedInstrument
{
	public static void main(String[] arg)
	{
		ClassBaseGuitar Objbg = new ClassBaseGuitar();
		Objbg.play();
	}
	
	void play()
	{
		name = new String("Base Guitar");
		noofstrings = 8;
		super.play();
		System.out.println("Yeah, This is a "+super.name+" with " +super.noofstrings +" strings");
	}
}
