package com.xc.study.framework.springmvc.inaction.service;

import java.util.List;

import com.xc.study.framework.springmvc.inaction.bean.po.ApiPO;
import com.xc.study.framework.springmvc.inaction.exception.BusinessException;

public interface RestApiService {

	ApiPO getApiById(int id) throws BusinessException;

	List<ApiPO> getApisByPage(int currentPage, int pageSize) throws BusinessException;
}
