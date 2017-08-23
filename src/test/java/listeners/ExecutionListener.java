package listeners;

import org.testng.IExecutionListener;

public class ExecutionListener implements IExecutionListener {

	public void onExecutionStart() {
		System.out.println("TestNg Started");

	}

	public void onExecutionFinish() {
		System.out.println("TestNg Completed");
	}

}
