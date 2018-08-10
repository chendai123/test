package demo.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel("userInput输入信息")
public class UserInput implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value = "用户id")
	@NotNull(message = "用户id不能为空")
    private Long userId;

	@ApiModelProperty(value = "反馈内容")
	@NotNull(message = "反馈内容不能为空")
	@Size(min = 2,max = 500,message = "反馈内容2-500个字符之间")
    private String content;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	


}

