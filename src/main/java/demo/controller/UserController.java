package demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import  demo.entity.User;
import  demo.entity.UserInput;
import demo.service.UserService;

@RestController
@Api("示范swagger")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//get请求这么写就行
	@ApiOperation(value = "反馈列表api新增记录", notes = "反馈列表api新增记录")
	@GetMapping(value="getUser")
	public User getUser(){
		
		return userService.getAllUser();
	}
	
	//post请求写法
	@ApiOperation(value = "接收参数示例", notes = "接收参数示例")
    @ApiImplicitParam(name = "userInput", value = "入参", required = true, dataType = "UserInput", paramType = "body")
	@PostMapping("/v1/getPostUser")
	public String getPost(@RequestBody UserInput userInput){
		
		return"333";
	}

	/**
	 * 打开 http://localhost:8082/swagger-ui.html 这个网址即可看到swagger界面
	 * post类型的测试数据的格式 {"userId":1,"content":"aa"}
	 * 更详细的去这个网址看 https://blog.csdn.net/weixin_39477597/article/details/79639239
	 * 这是我的csdn博客里面的一篇文章
	 */

}
