
public class mallardDuck extends duck{
	
	public mallardDuck()
	{
		super();
		quackbehavior= new MuteQuack();
		Flybehavoir= new cantFly();
	}
	
}
