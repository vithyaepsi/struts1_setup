<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<SCRIPT language="javascript" type="text/javascript">
	function setYesorno(valeur){
		document.forms[1].yesorno.value=valeur;
		console.log(valeur);
	}
</SCRIPT>
</head>
<body>
	<h1>HI THERE
	</h1>
	<div>
		<h2>Tu peux te logger là : </h2>
		<html:form action="/login.do">
			<div><label for="login">Votre nom : </label><input id="login" name="login" type="text" /></div>
			<div><label for="password">Votre mot de passe : </label><input id="password" name="password" type="password" /></div>
			<html:submit property="submit" value="Envoyer"/>
		</html:form>
	</div>
	<div>
		<html:form action="/message.do">
			<html:hidden property="yesorno" value="aucune"/>
			<h2>Yo, comment tu me trouves ?</h2>
			<html:submit onclick="setYesorno('insult');">Moche</html:submit>
			<html:submit onclick="setYesorno('greet');">Cool</html:submit>
		</html:form>
	</div>
	<div>
		<h2>Je te propose quelques trucs : </h2>
		<ul>
			<li><a href="weather.do">La météo</a></li>
			<li><a href="time.do">L'heure courante</a></li>
			<li>QUE DALLE D'AUTRE</li>
		</ul>
	</div>
</body>
</html>