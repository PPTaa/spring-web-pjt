package com.pptaa.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class SampleDTOLIst {
	
	private List<SampleDTO> list;
	
	public SampleDTOLIst() {
		list = new ArrayList<>();
	}
}
