
public class ClassElectricGuitar extends ClassStringedInstrument
{
	public static void main(String[] arg)
	{
		ClassElectricGuitar Objeg = new ClassElectricGuitar();
		Objeg.play();
	}
	
	void play()
	{
		super.play();
		System.out.println("Yeah, This is an Electric Guitar");
	}
}
