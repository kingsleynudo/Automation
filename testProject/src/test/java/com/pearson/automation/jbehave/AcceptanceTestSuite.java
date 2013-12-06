package com.pearson.automation.jbehave;

import net.thucydides.core.ThucydidesSystemProperty;
import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {
	public AcceptanceTestSuite() {
	    getSystemConfiguration().setIfUndefined(ThucydidesSystemProperty.THUCYDIDES_STORE_HTML_SOURCE.getPropertyName(), "true");
	    getSystemConfiguration().setIfUndefined(ThucydidesSystemProperty.THUCYDIDES_TAKE_SCREENSHOTS.getPropertyName(), "FOR_FAILURES");
	    }

}
