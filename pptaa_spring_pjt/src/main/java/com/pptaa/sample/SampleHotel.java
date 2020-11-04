package com.pptaa.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@Data
@AllArgsConstructor
public class SampleHotel {
	
	private Chef chef;

}
