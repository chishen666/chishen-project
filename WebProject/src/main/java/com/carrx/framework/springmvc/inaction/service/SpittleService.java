package com.xc.study.framework.springmvc.inaction.service;

import java.util.List;

import com.xc.study.framework.springmvc.inaction.bean.po.SpittlePO;

public interface SpittleService {
	List<SpittlePO> listSpittles(long max, int count);
}
