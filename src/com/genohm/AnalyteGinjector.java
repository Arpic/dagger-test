package com.genohm;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = AnalyteModule.class)
@Singleton
public interface AnalyteGinjector {
	AnalyteView getAnalytePresenter();
}