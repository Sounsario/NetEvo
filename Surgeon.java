package sterling.spencer;

public class Surgeon {
	private int populationSize;
	private int maxNumOfSpeciesPerPopulation;
	
	private double[][] trainingInputs;
	private double[][] trainingOutputs;
	private double[][] testInputs;
	private double[][] testOutputs;
	
	int targetAccuracy;
	int maxGeneration;
	
	int currentAccuracy;
	int currentGeneration = 0;
	
	public Surgeon(int popSize, int maxPerPop,
				   double[][] trainIn, double[][] trainOut, double[][] testIn, double[][] testOut,
				   int targetAcc, int maxGen) {
		
	}
	
	public void train() {
		
	}
	
	public void test() {
		
	}
	
	public boolean hasReachedTargetAccuracy() {
		return (targetAccuracy <= currentAccuracy);
	}
	
	public boolean hasReachedMaxGeneration() {
		return (maxGeneration <= currentGeneration);
	}
}
