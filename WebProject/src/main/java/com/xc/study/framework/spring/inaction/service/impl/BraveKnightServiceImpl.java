package com.xc.study.framework.spring.inaction.service.impl;

import com.xc.study.framework.spring.inaction.service.KnightService;
import com.xc.study.framework.spring.inaction.service.RequestService;

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
