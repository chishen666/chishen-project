package com.carrx.springmvc.inaction.service;

import java.util.List;

import com.carrx.springmvc.inaction.bean.po.SpittlePO;

public interface SpittleService {
	List<SpittlePO> listSpittles(long max, int count);
}
