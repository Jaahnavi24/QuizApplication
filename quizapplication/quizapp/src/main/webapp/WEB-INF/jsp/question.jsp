<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Question title here</title>
</head>
<body>


<h1>Java Quiz</h1>
  <form action="/submitQuiz" method = "POST"> 
<ul>
        <%
            // Assume 'items' is a List<String> passed from the controller
            List<String> items = (List<String>) request.getAttribute("questionTitle");
            //for (int i = 0; i < items.size(); i++) { 
                String question = items.get(0);
                String option1 = items.get(1);
                String option2 = items.get(2);
                String option3 = items.get(3);
                String option4 = items.get(4);
               
                    String question2 = items.get(5);
                    String option21 = items.get(6);
                    String option22 = items.get(7);
                    String option23 = items.get(8);
                    String option24 = items.get(9); 
                    
                    String question3 = items.get(10);
                    String option31 = items.get(11);
                    String option32 = items.get(12);
                    String option33 = items.get(13);
                    String option34 = items.get(14); 
                    
                    String question4 = items.get(15);
                    String option41 = items.get(16);
                    String option42 = items.get(17);
                    String option43 = items.get(18);
                    String option44 = items.get(19); 
                    
                    String question5 = items.get(20);
                    String option51 = items.get(21);
                    String option52 = items.get(22);
                    String option53 = items.get(23);
                    String option54 = items.get(24); 
                 
        %>
        <h5><%= question%></h5>
          
          <input type="radio" value = "<%= option1 %>">
          <label for="option1"><%= option1 %></label><br>
          <input type="radio" value = "<%= option2 %>">
          <label for="option1"><%= option2 %></label><br>
          <input type="radio" value = "<%= option3 %>">
          <label for="option1"><%= option3 %></label><br>
          <input type="radio" value = "<%= option4 %>">
          <label for="option1"><%= option4 %></label><br>
          
          <h5><%= question2%></h5>
          <input type="radio" value = "<%= option21 %>">
          <label for="option1"><%= option21 %></label><br>
          <input type="radio" value = "<%= option22 %>">
          <label for="option1"><%= option22 %></label><br>
          <input type="radio" value = "<%= option23 %>">
          <label for="option1"><%= option23 %></label><br>
          <input type="radio" value = "<%= option24 %>">
          <label for="option1"><%= option24 %></label><br>
          
          <h5><%= question3%></h5>
          <input type="radio" value = "<%= option31 %>">
          <label for="option1"><%= option31 %></label><br>
          <input type="radio" value = "<%= option32 %>">
          <label for="option1"><%= option32 %></label><br>
          <input type="radio" value = "<%= option33 %>">
          <label for="option1"><%= option33 %></label><br>
          <input type="radio" value = "<%= option34 %>">
          <label for="option1"><%= option34 %></label><br>
          
          <h5><%= question4%></h5>
          <input type="radio" value = "<%= option41 %>">
          <label for="option1"><%= option41 %></label><br>
          <input type="radio" value = "<%= option42 %>">
          <label for="option1"><%= option42 %></label><br>
          <input type="radio" value = "<%= option43 %>">
          <label for="option1"><%= option43 %></label><br>
          <input type="radio" value = "<%= option44 %>">
          <label for="option1"><%= option44 %></label><br>
          
          <h5><%= question5%></h5>
          <input type="radio" value = "<%= option51 %>">
          <label for="option1"><%= option51 %></label><br>
          <input type="radio" value = "<%= option52 %>">
          <label for="option1"><%= option52 %></label><br>
          <input type="radio" value = "<%= option53 %>">
          <label for="option1"><%= option53 %></label><br>
          <input type="radio" value = "<%= option54 %>">
          <label for="option1"><%= option54 %></label><br>
          
           
        
           
       
  </ul>
  <input type="submit" value="Submit">
  </form>   
  <br>
  <br>
  
       
          
           
        
  
</body>
</html>