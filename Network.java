package sterling.spencer;

import java.util.ArrayList;

public class Network {
	private Neuron[] inputNeurons;
	private Axon[] inputAxons;
	
	private ArrayList<Neuron> Neurons;
	private ArrayList<Axon> axons;
	
	private Neuron[] outputNeurons;
	
	public Network(double[] inputs, int numOfOutputs) {
		setInputs(inputs);
		initOutputs(numOfOutputs);
	}
	
	private void setInputs(double[] inputs) {
		inputNeurons = new Neuron[inputs.length];
		
		for(int i = 0; i < inputs.length; i++) {
			inputNeurons[i] = new Neuron(inputs[i]);
		}
	}
	
	private void initOutputs(int numOfOutputs) {
		outputNeurons = new Neuron[numOfOutputs];
		
		for(int i = 0; i < numOfOutputs; i++) {
			outputNeurons[i] = new Neuron(0);
		}
	}
}
