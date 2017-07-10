<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<body>

	<h1>Rackers</h1>
	
	<c:forEach items="${rackerList}" var="racker">
		<h3>
			${racker.name}: ${racker.title}
		</h3>
		<strong>Strengths</strong>
		<ul>
			<c:forEach items="${racker.strengths}" var="strength">
			<li>${strength}</li>
			</c:forEach>
		</ul>
		<hr/>
	</c:forEach>

</body>
</html>