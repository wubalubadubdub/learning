package learning;

public class WorkerInterfaceTest {
	
	public static void execute(WorkerInterface worker) {
		worker.doSomeWork();
	}
	/*the execute method takes in an object of type WorkerInterface and then calls the 
	 * doSomeWork method on that interface
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoke doSomeWork using anonymous class
		execute(new WorkerInterface () { 
			@Override
			public void doSomeWork() {
				System.out.println("Invoked from anonymous class");
			}
		});
		
		//invoke doSomeWork using a lambda expression
		execute( () -> System.out.println("Invoked using lambda expression"));

	}

}
