package edu.uml.model;

import java.util.ArrayList;
import java.util.regex.Pattern;

abstract public class Telephone {
	protected boolean onCall = false;
	protected ArrayList<String> callHistory = new ArrayList<String>();
	private Pattern pattern = Pattern.compile("^[1-9]{11}$");
			
	protected void call(String number) {
		this.onCall = true;
		if (pattern.matcher(number).matches()) {
			System.out.println("Ligando para "+number);
			this.callHistory.add(number);
		} else {
			this.startVoiceMail();
		}
	};
	
	protected void toMeet(String number) {
		System.out.println("Recebendo ligação do numero "+number);
		this.call(number);
	};
	
	protected void startVoiceMail() {
		System.out.println("iniciando correrio voz, deie sua mensagem");
		this.onCall = false;
	};
	
	protected ArrayList<String> getCallHistory() {
		return this.callHistory;
	}
}
