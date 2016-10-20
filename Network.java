package sterling.spencer;

public class Network {
	private Neuron[] inputNeurons;
	private Axon[][] inputAxons;
	
	private Neuron[] neurons;
	private Axon[][] axons;
	
	private Neuron[] outputNeurons;
	
	public Network(double[] inputs, int numOfNeurons, int numOfOutputs) {
		setInputs(inputs, numOfNeurons);
		initNeuroNet(numOfNeurons);
		initOutputs(numOfOutputs);
	}
	
	private void setInputs(double[] inputs, int numOfNeurons) {
		inputNeurons = new Neuron[inputs.length];
		inputAxons = new Axon[inputs.length][numOfNeurons];
		
		for(int i = 0; i < inputs.length; i++) {
			inputNeurons[i] = new Neuron(inputs[i]);
			
			for(int j = 0; j < numOfNeurons; j++) {
				inputAxons[i][j] = new Axon(i,j);
			}
		}
	}
	
	private void initNeuroNet(int numOfNeurons) {
		neurons = new Neuron[numOfNeurons];
		axons = new Axon[numOfNeurons][numOfNeurons - 1];
		
		for(int i = 0; i < numOfNeurons; i++) {
			neurons[i] = new Neuron();
			
			for(int j = 0; j < numOfNeurons - 1; j++) {
				axons[i][j] = new Axon(i,j);
			}
		}
	}
	
	private void initOutputs(int numOfOutputs) {
		outputNeurons = new Neuron[numOfOutputs];
		
		for(int i = 0; i < numOfOutputs; i++) {
			outputNeurons[i] = new Neuron(0);
		}
	}
}
