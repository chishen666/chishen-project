package com.xc.study.framework.spring.inaction.beanwired.service.impl;

import com.xc.study.framework.spring.inaction.beanwired.service.KnightService;
import com.xc.study.framework.spring.inaction.beanwired.service.RequestService;

public class BraveKnightServiceImpl implements KnightService {

	private RequestService requestService;

	public BraveKnightServiceImpl(RequestService requestService) {
		this.requestService = requestService;
	}

	@Override
	public void embarkOneQuest() {
		requestService.embark();
	}

}
