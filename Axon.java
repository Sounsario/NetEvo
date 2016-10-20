package sterling.spencer;

public class Axon {
	private double length;
	private int neuron1;
	private int neuron2;
	
	public Axon(int startNeuron, int endNeuron) {
		setLength();
		setStartpoint(startNeuron);
		setEndpoint(endNeuron);
	}
	
	private void setLength() {
		MultiTool mt =  new MultiTool();
		length = mt.randDouble(0, 1);
	}
	
	private void setStartpoint(int startNeuron) {
		neuron1 = startNeuron;
	}
	
	private void setEndpoint(int endNeuron) {
		neuron2 = endNeuron;
	}
	
	public double getLength() {
		return length;
	}
	
	public int getStartNeuron() {
		return neuron1;
	}
	
	public int getEndNeuron() {
		return neuron2;
	}
}