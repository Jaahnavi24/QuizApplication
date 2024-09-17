<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>Quiz Answers</h2>
 
<ul>
 <%
 
 List<String> items = (List<String>) request.getAttribute("answerlist");
  String question1 = items.get(0);
  String answer1 = items.get(1);
  String question2 = items.get(2);
  String answer2 = items.get(3);
  String question3 = items.get(4);
  String answer3 = items.get(5);
  String question4 = items.get(6);
  String answer4 = items.get(7);
  String question5 = items.get(8);
  String answer5 = items.get(9);
 
 
 %>

 <h5>1.<%=question1 %> </h5>
 <p>Answer: <%=answer1 %> </p>
 <h5>2.<%=question2 %> </h5>
 <p>Answer: <%=answer2 %> </p>
 <h5>3.<%=question3 %> </h5>
 <p>Answer: <%=answer3 %> </p>
 <h5>4.<%=question4 %> </h5>
 <p>Answer: <%=answer4 %> </p>
 <h5>5.<%=question5 %> </h5>
 <p>Answer: <%=answer5 %> </p>




</ul>
</body>
</html>