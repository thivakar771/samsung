package org.phone;

public class InternalStorage {
private void processorName() {
System.out.println("processor name-snapdrogan");
}
private void ramSize() {
System.out.println("ramsize-4gp");
}
public static void main(String[] args) {
	InternalStorage t = new InternalStorage();
	t.processorName();
	t.ramSize();
	ExternalDetails y = new ExternalDetails();
	y.size();
	y.value();
}
}
