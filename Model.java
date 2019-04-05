import java.util.HashMap;

public class Model {
	
    HashMap<Integer, Long> cashMinneModel = new HashMap<Integer,Long>();
	
	private Long getValueFromMemory(Integer value) {
		if (cashMinneModel.get(value) == null) {
			return null;
		} else {
			return cashMinneModel.get(value);
		}
	}
	
	private void addValueToMemory(Integer value, Long result) {
		
		cashMinneModel.put(value,result);
	}
	

	public void clearMemory() {
		
		cashMinneModel.clear();
	
	}
	
	private long computePower(int power) {
		if ( power == 0) {
			return 1;
		} else {
			return 2*computePower(power-1);
		}	
	}

	
	public long compute2Power (int power) {
		if (power < 0)
			throw new IllegalArgumentException();
		
		Long tmp = getValueFromMemory(power);
		if (tmp == null) {
			tmp = computePower(power);
			addValueToMemory(power, tmp);
		} 
		return tmp;
		
	}			
	
		
}
	
	

