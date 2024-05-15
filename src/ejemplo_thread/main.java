package ejemplo_thread;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process pc1 = new process("Proceso 1");
		process pc2 = new process("Proceso 2");
		process pc3 = new process("Proceso 3");
		
		pc1.start();
		pc2.start();
		pc3.start();
	}

}
