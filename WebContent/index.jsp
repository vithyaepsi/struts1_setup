<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>HI THERE
	</h1>
	<div>
		<html:form action="/login.do" focusIndex="reference">
			<div><label for="login">Votre nom : </label><input id="login" name="login" type="text" /></div>
			<div><label for="password">Votre mot de passe : </label><input id="password" name="password" type="password" /></div>
			<html:submit property="submit" value="Envoyer"/>
		</html:form>
	</div>
</body>
</html>