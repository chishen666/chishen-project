package com.carrx.springmvc.inaction.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carrx.springmvc.inaction.bean.po.ApiPO;
import com.carrx.springmvc.inaction.exception.BusinessException;
import com.carrx.springmvc.inaction.service.RestApiService;

@Service
public class RestApiServiceImpl implements RestApiService {

	@Override
	public ApiPO getApiById(int id) throws BusinessException {
		if (id <= 0) {
			throw new BusinessException("1001", "查询api错误,id需要大于0");
		}
		return new ApiPO(id, "https://www.xc.com" + id, id / 2 == 0 ? "get" : "post");
	}

	@Override
	public List<ApiPO> getApisByPage(int currentPage, int pageSize) {
		return null;
	}

}
