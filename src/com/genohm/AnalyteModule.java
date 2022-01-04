package com.genohm;

import dagger.Module;
import dagger.Provides;

@Module
public class AnalyteModule {

	@Provides
	public AnalyteButton button() {
		return new AnalyteButton();
	}

	@Provides
	public AnalyteSomething something() {
		return new AnalyteSomething();
	}
}
