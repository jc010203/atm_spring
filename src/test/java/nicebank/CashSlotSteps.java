/***
 * Excerpted from "The Cucumber for Java Book",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/srjcuc for more book information.
***/
package nicebank;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import cucumber.api.java.en.Given;

public class CashSlotSteps {

	@Autowired
	private CashSlot cashSlot;

	@Given("^\\$(\\d+) should be dispensed$")
	public void $ShouldBeDispensed(int dollars) throws Throwable {
		Assert.assertEquals("Incorrect amount dispensed -", dollars, cashSlot.getContents());
	}
}
