<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--
<c:if test="">
		<h1>No ha podido iniciar sesión, intentelo denuevo.</h1>
</c:if> 
<div class="container">
	<form action="ControllerServlet" method="post">
		Name:<input type="text" name="name"><br>
		Password:<input	type="password" name="password"><br>
		<input type="submit" value="login">
	</form>
</div>
 --%>
<div class="row">
	<div class="container">
		<div class="wrapper fadeInDown">
			<div id="formContent">
				<!-- Tabs Titles -->

				<!-- Icon -->
				<div class="fadeIn first">
					<img
						src="https://i.pinimg.com/originals/48/f9/97/48f997ae7a801924cde1d5d849291c8e.png"
						id="icon" alt="User Icon" style="width=20px;" />
				</div>

				<!-- Login Form -->
				<form action="Log" method="post">
					<input type="email" id="login" class="fadeIn second" name="name" placeholder="login">
					<input type="password" id="password" class="fadeIn third" name="password" placeholder="password"> 
					<input type="submit" class="fadeIn fourth" value="Log In">
				</form>

				<!-- Remind Passowrd -->
				<div id="formFooter">
					<a class="underlineHover" href="#">Forgot Password?</a>
				</div>
			</div>
		</div>
	</div>
</div>