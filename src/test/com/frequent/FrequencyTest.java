package test.com.frequent;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.frequent.Frequency;



public class FrequencyTest {

	
	Frequency frequency ;
	
	public Frequency getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

	@Before
	public void setup(){
		
		this.setFrequency(new Frequency());
		
	}
	
	@Test
	public void test() {
	
		Map frequencyUniverse = new HashMap<Integer, Integer>();
				
		frequencyUniverse.put(1, 1);
		
		frequencyUniverse.put(2, 2);
		
		frequencyUniverse.put(3, 3);
		
		Integer frequentNumber = this.getFrequency().getFrequentNumber(frequencyUniverse);
		System.out.println(frequentNumber);
		assertTrue(frequentNumber.equals(3));
	
	}

	
	
	
	@Test
	public void testUnsorted() {
	
		Map frequencyUniverse = new HashMap<Integer, Integer>();
				
		frequencyUniverse.put(1, 6);
		
		frequencyUniverse.put(11, 2);
		
		frequencyUniverse.put(3, 2);
		frequencyUniverse.put(2, 1);
		
		Integer frequentNumber = this.getFrequency().getFrequentNumber(frequencyUniverse);
		System.out.println(frequentNumber);
		assertTrue(frequentNumber.equals(1));
	
	}
	
	@Test
	public void testUnsortedNull() {
	
		Map frequencyUniverse = new HashMap<Integer, Integer>();
				
		frequencyUniverse.put(1, null);
		
		frequencyUniverse.put(11, 4);
		
		frequencyUniverse.put(3, 2);
		frequencyUniverse.put(2, 1);
		
		Integer frequentNumber = this.getFrequency().getFrequentNumber(frequencyUniverse);
	
		assertTrue(frequentNumber.equals(11));
	
	}
}
