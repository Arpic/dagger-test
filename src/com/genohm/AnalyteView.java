package com.genohm;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class AnalyteView {

	private final AnalyteButton analyteButton;

	@Inject
	public AnalyteView(AnalyteButton analyteButton,
	                   AnalyteSomething analyteSomething,
	                   AnalyteButton analyteButton2) {
		this.analyteButton = analyteButton;
	}
}
