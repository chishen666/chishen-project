package com.xc.study.framework.springmvc.inaction.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xc.study.framework.springmvc.inaction.bean.po.ApiPO;
import com.xc.study.framework.springmvc.inaction.exception.BusinessException;
import com.xc.study.framework.springmvc.inaction.service.RestApiService;

@RestController
@RequestMapping("/apis")
public class RestApiController {

	@Autowired
	private RestApiService restApiService;

	/**
	 * 分页查询一个apis
	 * @param currentPage
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<ApiPO> getApis(@RequestParam int currentPage, @RequestParam int pageSize) {
		return createList(pageSize);
	}

	/**
	 * 查询一个api
	 * @param id
	 * @return
	 * @throws BusinessException 
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ApiPO getApi(@PathVariable int id) throws BusinessException {
		return restApiService.getApiById(id);
	}

	private List<ApiPO> createList(int pageSize) {
		List<ApiPO> apiPoes = new ArrayList<>();
		for (int i = 0; i < pageSize; i++) {
			apiPoes.add(new ApiPO(i, "https://www.xc.com" + i, i / 2 == 0 ? "get" : "post"));
		}
		return apiPoes;
	}

}
