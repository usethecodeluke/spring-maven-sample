<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>

	<h1>Rackers</h1>
	
	<c:forEach items="${rackerList}" var="racker">
		<div>
		<h3 style="float: left;">
			${racker.name}: ${racker.title}
		</h3>
		<c:url value="http://127.0.0.1:8088/" var="qrurl"><c:param name="value" value="${racker.name}"/></c:url>
		<img src="${qrurl}" style="float: right;">
		</div>
		<div>
		<strong>Strengths</strong>
		<ul>
			<c:forEach items="${racker.strengths}" var="strength">
			<li>${strength}</li>
			</c:forEach>
		</ul>
		<form:form method="POST">
		<input type="hidden" name="racker_id" value="${racker.id}">
		<input type="text" name="strength">
		<button type="submit">Add Stength</button>
		</form:form>
		</div>
		<hr/>
	</c:forEach>
	<a href="/springwebapp/racker/add">Add a racker</a>

</body>
</html>