package com.bridge.desafio.controllers.rest;

import java.util.List;
import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CalculatorController {
	
	@GetMapping(value="/calculate", produces = MediaType.APPLICATION_JSON_VALUE)
	public String calculate(@RequestParam Integer input) {
		return "{\"numbers\": \""+ numbersWithCommonAmountOfDivisors(input).toString() +"\" ,\"amount\":\"" + numbersWithCommonAmountOfDivisors(input).size() +"\" }";
	}
	
	private List<Integer> numbersWithCommonAmountOfDivisors(int input){
//		tem que rever a eficiencia,  ta repetindo o calculo em cada iteração, desnecessariamente
		List<Integer> numbers = new ArrayList<Integer>();
		for (int smallerNumber = 2; smallerNumber<input; smallerNumber++) {
			int nDivisors = 1;
			int nPlusOneDivisors = 1;
			for(int possibleDivisor = 2; possibleDivisor<=smallerNumber; possibleDivisor++) {
				if(smallerNumber%possibleDivisor==0) {
					nDivisors++;
				}
			}
			for(int possibleDivisor = 2; possibleDivisor<=smallerNumber+1; possibleDivisor++) {
				if((smallerNumber+1)%possibleDivisor==0) {
					nPlusOneDivisors++;
				}
			}
			if(nDivisors==nPlusOneDivisors) {
				numbers.add(smallerNumber);
			}
		}
		return numbers;	
	}
}
