public class HelloWorld {

	private native void chamarMensagem(String nome);

	public native static int dobrar(int valor); 

	public static void main(String[] args) {
		String nome=args[0]==null?"nome":args[0];
		int valor=args[1]==null?2:Integer.valueOf(args[1]);
		HelloWorld helloWorld=new HelloWorld();
		helloWorld.chamarMensagem(nome);
		int resultado=HelloWorld.dobrar(valor);
		System.out.println("O dobro de "+valor+" é: "+ resultado);
	}

	static {System.loadLibrary("HelloWorld");}

}
