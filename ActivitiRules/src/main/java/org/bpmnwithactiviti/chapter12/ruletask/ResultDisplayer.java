package main.java.org.bpmnwithactiviti.chapter12.ruletask;

import main.java.org.bpmnwithactiviti.chapter12.model.LoanApplication;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class ResultDisplayer implements JavaDelegate {

	public void execute(DelegateExecution execution) {
		LoanApplication la = (LoanApplication) execution.getVariable("loanApplication");
		System.out.println(">>> LoanApplication = " + la);
	}
}
