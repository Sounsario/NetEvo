package sterling.spencer;

public class Neuron {
	private double value;
	private Function function;
	
	public Neuron() {
		function = new Function();
	}
	
	public Neuron(double val) {
		setValue(val);
	}
	
	public void setValue(double val) {
		value = val;
	}
	
	public double getValue() {
		return value;
	}
	
	public void getFuncOutput() {
		function.run();
	}
}
