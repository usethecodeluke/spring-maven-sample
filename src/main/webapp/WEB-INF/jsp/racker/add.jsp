<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>

	<h1>Add a Racker</h1>

	<form:form method="POST" modelAttribute="racker">
		<p>
			Name:
			<input type="text" name="name" />
			<form:errors path="name" cssclass="error"></form:errors>
		</p>
		<p>
			Title:
			<input type="text" name="title" />
			<form:errors path="title" cssclass="error"></form:errors>
		</p>

		<input type="submit" />
	</form:form>

</body>
</html>