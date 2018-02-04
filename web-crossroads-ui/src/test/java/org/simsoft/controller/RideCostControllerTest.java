package org.simsoft.controller;

import org.junit.Assert;
import org.junit.Test;
import org.simsoft.calculations.sources.ride_cost.RideCostOutput;
import org.simsoft.model.RideCostModel;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

public class RideCostControllerTest extends ControllerTestBase {

	@Test
	public void testCalculation() throws Exception {
		RideCostModel model = RideCostModel.getNewModel();
		model.setGasCost(28.50);
		model.setGasConsumption(6.5);
		model.setDistance(540);
		double expectedResult = 1000.35;
		
		mockMvc.perform(post("/calculations/ridecost/").flashAttr("rideCostModel", model))
										 			   .andExpect(new RideCostResultHandler(expectedResult));
	}
	
	private class RideCostResultHandler implements ResultMatcher {

		private final double expectedResult;
		
		private RideCostResultHandler(double expectedResult) {
			this.expectedResult = expectedResult;
		}
		
		@Override
		public void match(MvcResult result) throws Exception {
			RideCostOutput output = (RideCostOutput) result.getModelAndView().getModel().get("rideCostOutput");
			Assert.assertTrue("Result: " + output.getResult().doubleValue(), output.getResult().doubleValue() == expectedResult);
		}
		
	}
	
}