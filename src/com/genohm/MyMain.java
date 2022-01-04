package com.genohm;

public class MyMain {

	public static void main(String[] args) {
		AnalyteView coffeeShop = DaggerAnalyteGinjector.builder()
				.analyteModule(new AnalyteModule())
				.build()
				.getAnalytePresenter();
	}

}
