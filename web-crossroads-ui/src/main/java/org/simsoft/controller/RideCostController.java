package org.simsoft.controller;

import org.simsoft.calculations.calculators.RideCostCalculator;
import org.simsoft.calculations.sources.ride_cost.RideCostInput;
import org.simsoft.calculations.sources.ride_cost.RideCostOutput;
import org.simsoft.model.RideCostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RideCostController {

	@Autowired
	public RideCostCalculator rideCostCalculator;
	
	@RequestMapping(value = "/calculations/ridecost/", method = RequestMethod.GET)
	public String getRideCost(Model model) {
		model.addAttribute("rideCostModel", RideCostModel.getNewModel());
		return "ride-cost";
	}
	
	@RequestMapping(value = "/calculations/ridecost/", method = RequestMethod.POST)
	public String postRideCost(@ModelAttribute("rideCostModel") RideCostModel rideCostModel, Model model) {
		RideCostOutput output = rideCostCalculator.calculate(new RideCostInput(rideCostModel));
		model.addAttribute("rideCostOutput", output);
		return "ride-cost";
	}
	
}