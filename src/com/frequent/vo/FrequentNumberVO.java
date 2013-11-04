package com.frequent.vo;


public class FrequentNumberVO implements Comparable<FrequentNumberVO> {

	
	Integer number ;
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	} 
	Integer frequency;
	@Override
	public int compareTo(FrequentNumberVO frequentNumberVO) {
		
		if (frequentNumberVO !=null )
		{
			
			if (frequentNumberVO instanceof FrequentNumberVO){
				
				if (this.getFrequency().equals(frequentNumberVO.getFrequency())){
					return 0;
					
				}
				
				if (this.getFrequency() > frequentNumberVO.getFrequency()){
					return 1;
				}else{
					
					return -1;
				}
				
				
			}
		}
		return -1;
	}
	
}
