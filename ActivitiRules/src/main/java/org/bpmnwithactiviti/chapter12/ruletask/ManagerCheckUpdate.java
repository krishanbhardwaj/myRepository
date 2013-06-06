package main.java.org.bpmnwithactiviti.chapter12.ruletask;

import main.java.org.bpmnwithactiviti.chapter12.model.LoanApplication;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class ManagerCheckUpdate implements JavaDelegate {

	public void execute(DelegateExecution execution) {
		LoanApplication la = (LoanApplication) execution.getVariable("loanApplication");
		if("true".equalsIgnoreCase((String) execution.getVariable("requestApproved"))) {
			la.setStatus("approved by manager");
		} else {
			la.setStatus("denied by manager");
		}
		la.setMotivation((String) execution.getVariable("motivation"));
	}

}
