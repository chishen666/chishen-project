package com.xc.study.framework.springmvc.inaction.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.xc.study.framework.springmvc.inaction.bean.po.SpittlePO;
import com.xc.study.framework.springmvc.inaction.service.SpittleService;

@Service
public class SpittleServiceImpl implements SpittleService {

	@Override
	public List<SpittlePO> listSpittles(long max, int count) {
		return createSpittleList(count);
	}

	private List<SpittlePO> createSpittleList(int i) {
		List<SpittlePO> list = new ArrayList<>(i);
		for (i = 0; i < 20; i++) {
			list.add(new SpittlePO("Spittle" + i, new Date()));
		}
		return list;
	}

}
