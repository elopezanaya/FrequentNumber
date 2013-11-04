package com.frequent;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class Frequency {

	public Integer getFrequentNumber(Map<Integer,Integer> frequencyUniverse) {

	SortedSet<com.frequent.vo.FrequentNumberVO> frequentNumberVOs = new TreeSet();
	com.frequent.vo.FrequentNumberVO frequentNumberVO = null;
	for (Map.Entry rows  : frequencyUniverse.entrySet()){
		frequentNumberVO = new com.frequent.vo.FrequentNumberVO();
		frequentNumberVO.setNumber((Integer) rows.getKey());
		frequentNumberVO.setFrequency((Integer) rows.getValue());
		
		
		frequentNumberVOs.add(frequentNumberVO);
		
	}
		
	
	
	return frequentNumberVOs.last().getNumber();

	}

}
