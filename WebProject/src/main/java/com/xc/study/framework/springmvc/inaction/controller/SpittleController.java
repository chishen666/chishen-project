package com.xc.study.framework.springmvc.inaction.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xc.study.framework.springmvc.inaction.bean.po.SpittlePO;
import com.xc.study.framework.springmvc.inaction.service.SpittleService;

@Controller
@RequestMapping("/spittle")
public class SpittleController {

	private SpittleService spittleService;

	private static final String MAX_VALUE = Long.MAX_VALUE + "";

	/**
	 * 通过路径传参
	 */
	@Autowired
	public SpittleController(SpittleService spittleService) {
		super();
		this.spittleService = spittleService;
	}

	/*	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
		public String spittle(@PathVariable Long id) {
			System.out.printf("id = %s/n", id);
			return "spittles";
		}*/

	/**
	 * 查询参数
	 */
	// 方案1/3:使用spring类型Model
	/*	@RequestMapping(value = "/spittles", method = RequestMethod.GET)
		public String spittles(Model model, @RequestParam(value = "max", defaultValue = MAX_VALUE) long max,
				@RequestParam(value = "count", defaultValue = "20") int count) {
	
			// 声明方式1:隐示声明
			// model.addAttribute(spittleService.listSpittles(Long.MAX_VALUE, 20));
			System.out.printf("max = %s, count = %s/n", max, count);
			// 声明方式2:显示声明,等价于隐示,可以自定义model的key
			model.addAttribute("spittleList", spittleService.listSpittles(Long.MAX_VALUE, 20));
	
			// 返回视图名
			return "spittles";
		}*/

	// 方案2/3:使用非spring类型Map
	@RequestMapping(value = "/spittles", method = RequestMethod.GET)
	public String spittles(Map<String, List<SpittlePO>> model) {
		model.put("spittleList", spittleService.listSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}

	// 方案3/3:不返回视图名,直接返回模型,视图名和url一样
	/*	@RequestMapping(value = "/spittles", method = RequestMethod.GET)
		public List<Spittle> spittles() {
			return spittleService.listSpittles(Long.MAX_VALUE, 20);
		}*/

	/**
	 * 表单参数
	 */

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(SpittlePO spittle) {
		System.out.println(spittle.getMessage());
		// if (erros.hasErrors()) {
		// return "home";
		// }
		return "spittles";
	}

	@RequestMapping(value = "/restapi", method = RequestMethod.POST)
	public @ResponseBody String restApi(@RequestBody SpittlePO spittle) {

		return spittle.getMessage();
	}

}
