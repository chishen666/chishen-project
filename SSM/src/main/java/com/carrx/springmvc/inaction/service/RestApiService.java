package com.carrx.springmvc.inaction.service;

import java.util.List;

import com.carrx.springmvc.inaction.bean.po.ApiPO;
import com.carrx.springmvc.inaction.exception.BusinessException;

public interface RestApiService {

	ApiPO getApiById(int id) throws BusinessException;

	List<ApiPO> getApisByPage(int currentPage, int pageSize) throws BusinessException;
}
