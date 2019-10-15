<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.slksoft.entity.User"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
<title>MVC Demo App</title>

<link type="text/css" rel="stylesheet" href="assests/css/style.css">
</head>
<body>

	<div class="container">
		<div class="alert alert-primary">

			<h1 style="font-family:monotype corsiva">eMailer</h1>
			<p>Internet Mail System</p>
		</div>
		<a href="./">Home</a> |

		<%
			User user = (User) session.getAttribute("user");

			if (user != null) {
		%>

		<a href="./logout">Logout</a>

		<%
			} else {
		%>
		<a href="./login">Login</a>| <a href="./register">Register</a>
		<%
			}
		%>
		<div style="min-height: 500px">