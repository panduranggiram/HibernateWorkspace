<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>

</head>
<body>

<h1>welcome To Success Page</h1>
  <h4>${msg}</h4>
  
  <c:forEach items="${data}" var="s">
  
  <input type="radio" name="sid" value="${s.sid}">
  		
  		${s.eid}
  		${s.name}
  		${s.city}
  		${s.dept}
  		${s.uname}
  		${s.pass}
  		
   
   </c:forEach>
  
</body>
</html>