<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
   com.zoo.Tiger tiger = null;
   try{
	   com.zoo.TigerHome home = com.zoo.TigerUtil.getHome();
	   tiger = home.create();
	   
   }catch(Exception exception)
   {
	   
   }
   

%>
<b><%= tiger.roar() %></b>
</body>
</html>