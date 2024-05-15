package ejemplo_thread;

public class process extends Thread{
	//String nameProcess;
	
	
	public process(String nameProcess) {
		super();
		//this.nameProcess = nameProcess;
	}

	public void listValues() {
		for(int i=0;i<5;i++) {
			System.out.println(getName()+":"+i);
		}
	}
	public void run() {
		listValues();
	}
}
