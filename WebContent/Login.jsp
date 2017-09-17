<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>my first struts practice</title>
</head>
<body>
<table>
<tr>
<td>
<h2>Please Login</h2>
    <s:if test="tip!=null">
	<div class="error">
	    <s:property value="tip"/>
	</div>
	</s:if>
    <s:form action="login">
        <s:textfield name="user.username" label="your name"/>
        <s:password name="user.pass" label="password"/>
        <s:textfield name="valicode" label="valicode"/>
        <s:submit value="Submit"/>
        <s:reset value="Reset" />
    </s:form>
   验证码：<img name="d" src="authImg.jsp"/>
</td>
</tr>
</table>
    
</body>
</html>