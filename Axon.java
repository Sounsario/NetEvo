package sterling.spencer;

public class Axon {
	private double length;
	private int neuron1;
	private int neuron2;
	
	public Axon(int rangeMax) {
		setLength();
		setStartpoint(rangeMax);
		setEndpoint(rangeMax);
	}
	
	private void setLength() {
		MultiTool mt =  new MultiTool();
		length = mt.randDouble(0, 1);
	}
	
	private void setStartpoint(int rangeMax) {
		MultiTool mt = new MultiTool();
		neuron1 = mt.randInt(0, rangeMax);
	}
	
	private void setEndpoint(int rangeMax) {
		MultiTool mt = new MultiTool();
		neuron2 = neuron1;
		
		while(neuron2 == neuron1) {
			neuron2 = mt.randInt(0, rangeMax);
		}
	}
	
	public double getLength() {
		return length;
	}
}